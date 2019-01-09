package com.github.specht.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.github")
public class ObfuscationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObfuscationApplication.class, args);
	}

}

