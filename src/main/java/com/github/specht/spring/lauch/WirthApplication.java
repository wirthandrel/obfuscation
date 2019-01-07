package com.github.specht.spring.lauch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.github.specht")
public class WirthApplication {

	public static void main(String[] args) {
		SpringApplication.run(WirthApplication.class, args);
	}

}

