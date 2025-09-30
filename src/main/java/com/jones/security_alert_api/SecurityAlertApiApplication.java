package com.jones.security_alert_api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityAlertApiApplication {
	private static final Logger log = LoggerFactory.getLogger(SecurityAlertApiApplication.class);

	public static void main(String[] args) {
		System.out.println(">>> APP STARTING <<<");
		SpringApplication.run(SecurityAlertApiApplication.class, args);
		log.info(">>> Spring Boot main started <<<");
	}

}
