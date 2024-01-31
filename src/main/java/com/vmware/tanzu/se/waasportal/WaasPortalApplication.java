package com.vmware.tanzu.se.waasportal;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.ClientBuilder;

@SpringBootApplication
public class WaasPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaasPortalApplication.class, args);
	}

	@Bean
	public ApiClient apiClient() 
		throws IOException {
		return ClientBuilder.defaultClient();
	}

}
