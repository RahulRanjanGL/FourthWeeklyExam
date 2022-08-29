package com.java.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSimpleEurekaClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleEurekaClientAppApplication.class, args);
		System.out.println("Eureka Client Server Started...");
	}

}
