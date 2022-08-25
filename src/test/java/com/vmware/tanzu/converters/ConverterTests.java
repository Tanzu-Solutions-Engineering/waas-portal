package com.vmware.tanzu.converters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.isNotNull;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortal;
import com.vmware.tanzu.se.waasportal.converters.K8sTrainingPortalToTrainingPortal;
import com.vmware.tanzu.se.waasportal.converters.TrainingPortalToK8sTrainingPortal;
import com.vmware.tanzu.se.waasportal.model.TrainingPortal;
import com.vmware.tanzu.se.waasportal.model.TrainingPortalWorkshop;

public class ConverterTests {
  
  ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

  public ConverterTests() {
    mapper.findAndRegisterModules();
  }

  @Test
  public void convertsFromModelToK8sObjectWithDefaults() {
    TrainingPortalToK8sTrainingPortal converter = new TrainingPortalToK8sTrainingPortal();
    
    LocalDateTime expiry = LocalDateTime.now().plusDays(1);
    ZoneId expiryZone = ZoneId.of("America/New_York");

    TrainingPortal modelPortal = 
      TrainingPortal.builder()
      .name("Test Portal")
      .owner("cdelashmutt@vmware.com")
      .zone(expiryZone)
      .expires(expiry)
      .workshops(new TrainingPortalWorkshop[] {
        TrainingPortalWorkshop.builder()
        .name("Test")
        .build()
      })
      .build();
    V1beta1TrainingPortal k8sPortal = converter.convert(modelPortal);

    assertThat(k8sPortal, is(notNullValue()));
    assertThat(k8sPortal.getMetadata(), is(notNullValue()));
    assertThat(k8sPortal.getMetadata().getName(), is("Test Portal"));
    assertThat(k8sPortal.getMetadata().getAnnotations(), is(notNullValue()));
    assertThat(k8sPortal.getMetadata().getLabels().get(TrainingPortalToK8sTrainingPortal.OWNER_EMAIL_PREFIX_ANNOTATION), is("cdelashmutt"));
    assertThat(k8sPortal.getMetadata().getLabels().get(TrainingPortalToK8sTrainingPortal.OWNER_EMAIL_DOMAIN_ANNOTATION), is("vmware.com"));
    assertThat(k8sPortal.getMetadata().getAnnotations().get(TrainingPortalToK8sTrainingPortal.EXPIRY_TIMEZONE_ANNOTATION), is(expiryZone.getId()));
    assertThat(k8sPortal.getMetadata().getAnnotations().get(TrainingPortalToK8sTrainingPortal.EXPIRY_ANNOTATION), is(expiry.atZone(expiryZone).toInstant().toString()));
    
    assertThat(k8sPortal.getSpec().getWorkshops().size(), is(1));
    assertThat(k8sPortal.getSpec().getWorkshops().get(0).getName(), is("Test"));
    assertThat(k8sPortal.getSpec().getWorkshops().get(0).getCapacity(), is(20));
    assertThat(k8sPortal.getSpec().getWorkshops().get(0).getReserved(), is(2));
    assertThat(k8sPortal.getSpec().getWorkshops().get(0).getOrphaned(), is("20m"));
    assertThat(k8sPortal.getSpec().getWorkshops().get(0).getExpires(), is("60m"));

  }

  @Test
  public void convertsK8sObjectToModel()
  throws JsonProcessingException {
    K8sTrainingPortalToTrainingPortal converter = new K8sTrainingPortalToTrainingPortal();
    
    V1beta1TrainingPortal k8sPortal = mapper.readValue(
      """
        apiVersion: learningcenter.tanzu.vmware.com/v1beta1
        kind: TrainingPortal
        metadata:
          annotations:
            janitor/expires: "2022-08-18T12:53:00Z"
            kopf.zalando.org/last-handled-configuration: |
              {"foo":{"bar":[]}}
            waas/timezone: Europe/Madrid
          creationTimestamp: "2022-08-17T12:54:00Z"
          generation: 2
          labels:
            waas/owner-email-domain: here.com
            waas/owner-email-prefix: me
          name: me-workshop
          resourceVersion: "869104702"
          uid: c1d339aa-df69-4f75-93eb-1f0500666065
        spec:
          workshops:
          - capacity: 20
            expires: 60m
            name: a-workshop
            orphaned: 20m
            reserved: 2
        status:
          learningcenter:
            namespace: me-workshop-ui
            phase: Running
            secrets:
              ingress:
              - a-secret
              registry:
              - reg-creds
            url: https://me-workshop-ui.domain.test
      """
      , V1beta1TrainingPortal.class);

      TrainingPortal modelPortal = converter.convert(k8sPortal);
      assertThat(modelPortal, is(notNullValue()));
      assertThat(modelPortal.getName(), is("me-workshop"));
      ZoneId zone = modelPortal.getZone();
      assertThat(zone, is(ZoneId.of("Europe/Madrid")));
      assertThat(modelPortal.getExpires(), is(LocalDateTime.ofInstant(Instant.parse("2022-08-18T12:53:00Z"), zone)));
      assertThat(modelPortal.getOwner(), is("me@here.com"));
      assertThat(modelPortal.getUrl(), is("https://me-workshop-ui.domain.test"));
      TrainingPortalWorkshop workshops[] = modelPortal.getWorkshops();
      assertThat(workshops.length, is(1));
      assertThat(workshops[0].getName(), is("a-workshop"));
      assertThat(workshops[0].getCapacity(), is(20));
      assertThat(workshops[0].getReserved(), is(2));
      assertThat(workshops[0].getExpires(), is("60m"));
      assertThat(workshops[0].getOrphaned(), is("20m"));
  }

  @Test
  public void convertsK8sObjectWithCredentialsToModel()
  throws JsonProcessingException {
    K8sTrainingPortalToTrainingPortal converter = new K8sTrainingPortalToTrainingPortal();
    
    V1beta1TrainingPortal k8sPortal = mapper.readValue(
      """
        apiVersion: learningcenter.tanzu.vmware.com/v1beta1
        kind: TrainingPortal
        metadata:
          annotations:
            janitor/expires: "2022-08-18T12:53:00Z"
            kopf.zalando.org/last-handled-configuration: |
              {"foo":{"bar":[]}}
            waas/timezone: Europe/Madrid
          creationTimestamp: "2022-08-17T12:54:00Z"
          generation: 2
          labels:
            waas/owner-email-domain: here.com
            waas/owner-email-prefix: me
          name: me-workshop
          resourceVersion: "869104702"
          uid: c1d339aa-df69-4f75-93eb-1f0500666065
        spec:
          workshops:
          - capacity: 20
            expires: 60m
            name: a-workshop
            orphaned: 20m
            reserved: 2
        status:
          learningcenter:
            clients:
              robot:
                id: FAKEID
                secret: FAKESECRET
            credentials:
              admin:
                password: FAKEPASSWORD
                username: FAKEUSER
              robot:
                password: FAKEPASSWORD2
                username: FAKEUSER2
            namespace: me-workshop-ui
            phase: Running
            secrets:
              ingress:
              - a-secret
              registry:
              - reg-creds
            url: https://me-workshop-ui.domain.test
      """
      , V1beta1TrainingPortal.class);

      TrainingPortal modelPortal = converter.convert(k8sPortal);
      assertThat(modelPortal, is(notNullValue()));
      assertThat(modelPortal.getAdminUsername(), is("FAKEUSER"));
      assertThat(modelPortal.getAdminPassword(), is("FAKEPASSWORD"));
  }

}
