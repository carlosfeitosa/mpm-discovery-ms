package com.skull.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka server main class.
 * 
 * @author Carlos Feitosa (carlos.feitosa.nt@gmail.com)
 * @since 2020-08-15
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class MpmDiscoveryServiceApplication { // NOPMD by skull on 8/15/20, 12:03 AM

	/**
	 * Main application's method.
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {

		SpringApplication.run(MpmDiscoveryServiceApplication.class, args);
	}

}
