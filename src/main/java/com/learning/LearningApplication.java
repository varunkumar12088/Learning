package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		System.setProperty("aws.java.v1.disableDeprecationAnnouncement", "true");
		SpringApplication.run(LearningApplication.class, args);
	}

}
