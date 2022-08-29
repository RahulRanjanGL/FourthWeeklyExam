package com.java.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSimpleDockerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleDockerAppApplication.class, args);
		System.out.println("Docker Server Started...");
	}

}
