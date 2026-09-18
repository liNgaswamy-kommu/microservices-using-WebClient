package com.eidko.service_registry_wc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryWcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryWcApplication.class, args);
		System.err.println("*** Welcome to Eureka-Server-Wc ***");
	}

}
