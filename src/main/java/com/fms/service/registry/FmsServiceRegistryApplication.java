package com.fms.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FmsServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FmsServiceRegistryApplication.class, args);
	}

}
