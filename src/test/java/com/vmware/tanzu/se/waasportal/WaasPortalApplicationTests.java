package com.vmware.tanzu.se.waasportal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.ClientBuilder;

@SpringBootTest
class WaasPortalApplicationTests {

	@Test
	void contextLoads() {
	}

	@Configuration
	static class TestConfig {
		@Bean
		ApiClient getApiClient() {
			return new ClientBuilder().setBasePath("http://localhost:8090").build();
		}
	}
}
