package com.azurespring.azure.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSpringApplication {
	@GetMapping("/message")
	public String message() {
		return "Congrats ! your apppp is deployed!";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureSpringApplication.class, args);
	}

}
