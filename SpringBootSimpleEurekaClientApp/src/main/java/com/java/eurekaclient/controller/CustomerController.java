package com.java.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.eurekaclient.model.Customer;

@RestController
public class CustomerController {
	
	@GetMapping("/customer")
	public String getCustomerDetails() {
		
		Customer c1 = new Customer();
		
		c1.setCustId(1234);
		c1.setCustName("Rahul Ranjan");
		c1.setPhoneNo("8340761645");
		c1.setAddress("Siwan");
		
		Customer c2 = new Customer();
		
		c2.setCustId(9867);
		c2.setCustName("Vivek Gupta");
		c2.setPhoneNo("9070509461");
		c2.setAddress("Silvassa");
		
		return c1.toString() + "  " + c2.toString();
		
	}

}
