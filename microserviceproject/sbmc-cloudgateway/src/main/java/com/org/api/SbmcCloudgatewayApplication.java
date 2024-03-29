package com.org.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SbmcCloudgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmcCloudgatewayApplication.class, args);
	}

}
