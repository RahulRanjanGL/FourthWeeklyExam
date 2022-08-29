package com.java.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootSimpleEurekaServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleEurekaServerAppApplication.class, args);
		System.out.println("Eureka Server Started...");
	}

}
