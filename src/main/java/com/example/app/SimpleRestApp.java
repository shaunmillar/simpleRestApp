package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRestApp {

	public static void main(String[] args) {
		System.out.println("Starting the greeting application.");
		SpringApplication.run(SimpleRestApp.class, args);
	}

}
