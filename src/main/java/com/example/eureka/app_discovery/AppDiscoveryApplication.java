package com.example.eureka.app_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppDiscoveryApplication {
	// @EnableEurekaServer : This is to enable a Spring Boot application to function
	// as a Netflix Eureka
	public static void main(String[] args) {
		SpringApplication.run(AppDiscoveryApplication.class, args);
	}

}
