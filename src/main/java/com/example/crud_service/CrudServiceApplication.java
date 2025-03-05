package com.example.crud_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@OpenAPIDefinition(info = @Info(title = "User API", version = "1.0", description = "User Management API"))

@SpringBootApplication
public class CrudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudServiceApplication.class, args);
		System.out.println("Spring is running");
	}

}
