package com.junit.spring.demo.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.junit.spring.demo.service.CustomerService;
import com.junit.spring.demo.service.CustomerServiceImpl;

@Configuration
public class AppConfig {

	 @Bean
	 public CustomerService getCustomerService() {

	 return new CustomerServiceImpl();

	 }

}
