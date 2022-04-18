package com.vmware.tanzu.se.waasportal.controllers;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.hasItemInArray;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.authentication;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.vmware.tanzu.se.waasportal.model.TrainingPortal;
import com.vmware.tanzu.se.waasportal.service.TrainingPortalService;
import com.vmware.tanzu.se.waasportal.service.WorkshopService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2UserAuthority;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class TrainingPortalTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ClientRegistrationRepository clientRegistrationRepository;

    private OAuth2User principal;

    @BeforeEach
    public void setUpUser() {
        principal = createOAuth2User(
                "Test User", "test@user.com");
    }

    @MockBean
    private TrainingPortalService service;

    @MockBean
    private WorkshopService workshopService;

    @Test
    public void emptyTrainingPortalList() throws Exception {
        when(service.getTrainingPortalsForUser("test@user.com")).thenReturn(new TrainingPortal[]{});
        this.mockMvc.perform(
                get("/trainingportals")
                .with(authentication(getOauthAuthenticationFor(principal))))
            .andExpect(status().isOk())
            .andExpect(model().attribute("trainingPortals", arrayWithSize(0)));

    }

    @Test
    public void redirectUnauthenticated() throws Exception {
            this.mockMvc.perform(get("/trainingportals"))
            .andDo(print())
            .andExpect(status().isFound());
    }

    @Test
    public void userHasTrainingPortals() throws Exception {
        LocalDateTime expiry = LocalDateTime.now().plus(1, ChronoUnit.DAYS);
        ZoneId zone = ZoneId.of("America/New_York");
        when(service.getTrainingPortalsForUser("test@user.com")).thenReturn(
            new TrainingPortal[]{
                TrainingPortal.builder()
                    .name("Test")
                    .expires(expiry)
                    .zone(zone)
                .build()
            }
        );
        this.mockMvc.perform(
                get("/trainingportals")
                .with(authentication(getOauthAuthenticationFor(principal))))
            .andExpect(status().isOk())
            .andExpect(model().attribute("trainingPortals", notNullValue()))
            .andExpect(model().attribute("trainingPortals", hasItemInArray(allOf(
                hasProperty("name", equalTo("Test"))
                , hasProperty("expires", equalTo(expiry))
                , hasProperty("zone", equalTo(zone))
            ))));
    }

    public static OAuth2User createOAuth2User(String name, String email) {

        Map<String, Object> authorityAttributes = new HashMap<>();
        authorityAttributes.put("key", "value");

        GrantedAuthority authority = new OAuth2UserAuthority(authorityAttributes);

        Map<String, Object> attributes = new HashMap<>();
        attributes.put("sub", "1234567890");
        attributes.put("name", name);
        attributes.put("email", email);

        return new DefaultOAuth2User(Arrays.asList(authority), attributes, "sub");
    }
    
    public static Authentication getOauthAuthenticationFor(OAuth2User principal) {

        Collection<? extends GrantedAuthority> authorities = principal.getAuthorities();

        String authorizedClientRegistrationId = "my-oauth-client";

        return new OAuth2AuthenticationToken(principal, authorities, authorizedClientRegistrationId);
    }
}
