package com.skull.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MpmServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpmServiceDiscoveryApplication.class, args);
	}

}
