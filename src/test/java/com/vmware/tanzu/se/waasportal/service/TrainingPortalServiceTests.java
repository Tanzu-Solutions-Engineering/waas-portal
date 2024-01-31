package com.vmware.tanzu.se.waasportal.service;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Map;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.vmware.tanzu.se.waasportal.converters.K8sTrainingPortalToTrainingPortal;
import com.vmware.tanzu.se.waasportal.converters.TrainingPortalToK8sTrainingPortal;
import com.vmware.tanzu.se.waasportal.model.TrainingPortal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.core.convert.support.GenericConversionService;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.ClientBuilder;

public class TrainingPortalServiceTests {
    WireMockServer wireMockServer;

    GenericConversionService conversionService = new GenericConversionService();

    ApiClient client;

    @BeforeEach
    public void setup () {
        conversionService.addConverter(new TrainingPortalToK8sTrainingPortal());
        conversionService.addConverter(new K8sTrainingPortalToTrainingPortal());

        wireMockServer = new WireMockServer(8090);
        wireMockServer.stubFor(
            get(urlPathEqualTo("/apis/learningcenter.tanzu.vmware.com/v1beta1/trainingportals")).atPriority(1)
            .withQueryParams(Map.of(
                    "labelSelector", equalTo("waas/owner-email-prefix=cdelashmutt,waas/owner-email-domain=vmware.com")
                )
            )
            .willReturn(aResponse()
                .withBody(
                    """
                    {
                        "apiVersion": "v1",
                        "kind": "List",
                        "items": [
                            {
                                "apiVersion": "learningcenter.tanzu.vmware.com/v1beta1",
                                "kind": "TrainingPortal",
                                "metadata": {
                                    "annotations": {
                                        "janitor/expires": "2520-01-17T15:14:38Z",
                                        "waas/timezone": "America/New_York"
                                    },
                                    "labels": {
                                        "waas/owner-email-prefix": "cdelashmutt",
                                        "waas/owner-email-domain": "vmware.com"
                                    },
                                    "name": "test"
                                },
                                "spec": {
                                    "workshops": []
                                }
                            }                            
                        ]
                    }
                    """
                )
            )
        );
        wireMockServer.stubFor(
            get(urlMatching("/apis/learningcenter.tanzu.vmware.com/v1beta1/trainingportals?.*")).atPriority(5)
            .willReturn(aResponse()
                .withBody(
                    """
                    {
                        "apiVersion": "v1",
                        "kind": "List",
                        "items": []
                    }
                    """
                )
            )
        );
        wireMockServer.stubFor(
            get(urlMatching("/apis/")).atPriority(5)
            .willReturn(aResponse()
                .withBody(
                    """
                    {
                        "kind": "APIGroupList",
                        "apiVersion": "v1",
                        "groups": [
                            {
                                "name": "learningcenter.tanzu.vmware.com",
                                "versions": [
                                  {
                                    "groupVersion": "learningcenter.tanzu.vmware.com/v1beta1",
                                    "version": "v1beta1"
                                  }
                                ],
                                "preferredVersion": {
                                  "groupVersion": "learningcenter.tanzu.vmware.com/v1beta1",
                                  "version": "v1beta1"
                                }
                            }
                        ]
                    }
                    """
                )
            )
        );
        wireMockServer.start();
        client = new ClientBuilder().setBasePath("http://localhost:8090").build();
    }

    @AfterEach
    public void teardown () {
        wireMockServer.stop();
    }

    @Test
    public void returnsEmptyArray() throws Exception {
        EducatesApiService apiService = new EducatesApiService(client);
        TrainingPortalService portalService = new TrainingPortalService(apiService, conversionService);

        TrainingPortal portals[] = portalService.getTrainingPortalsForUser("test@user.com");
        assertThat(portals, is(notNullValue()));
        assertThat(portals.length, is(0));

    }

    @Test
    public void returnsTrainingPortal() throws Exception {
        EducatesApiService apiService = new EducatesApiService(client);
        TrainingPortalService portalService = new TrainingPortalService(apiService, conversionService);

        TrainingPortal portals[] = portalService.getTrainingPortalsForUser("cdelashmutt@vmware.com");
        assertThat(portals, is(notNullValue()));
        assertThat(portals.length, is(1));
        assertThat(portals[0].getName(), is("test"));
        assertThat(portals[0].getExpires(), is(LocalDateTime.ofInstant(Instant.parse("2520-01-17T15:14:38Z"), ZoneId.of("America/New_York"))));
        assertThat(portals[0].getZone(), is(ZoneId.of("America/New_York")));

    }

}
