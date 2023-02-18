package com.study.securitycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SecurityCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityCloudApplication.class, args);
	}

}
