package com.junit.spring.demo.service;

import com.junit.spring.demo.obj.Customer;

public interface CustomerService {
	
	 public String getCustomerAbout();

	 public String getCustomerAddress();

	 public Customer getCustomer(int custId);

	 public Customer createCustomer(Customer customer);

}
