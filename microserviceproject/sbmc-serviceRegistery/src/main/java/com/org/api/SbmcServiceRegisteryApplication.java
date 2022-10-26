package com.org.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbmcServiceRegisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmcServiceRegisteryApplication.class, args);
	}

}
