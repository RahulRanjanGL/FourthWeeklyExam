package com.junit.spring.demo.service;

import java.util.Random;
import com.junit.spring.demo.obj.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	public String getCustomerAbout() {
		
		Customer existingCustomer = new Customer();
		existingCustomer.setAboutCustomer("I am very passionate about my work");
		
		return "About: " + existingCustomer.getAboutCustomer();
	}
	 
	 public String getCustomerAddress() {
		 
		 Customer existingCustomer = new Customer();
		 existingCustomer.setCustAddress("Siwan");
		 
		 return "Customer Address: " + existingCustomer.getCustAddress();
	 }
	 
	 
	 public Customer getCustomer(int custId) {
		 
		 Customer newCustomer = new Customer();
		 
		 newCustomer.setCustId(new Random().nextInt());
		 newCustomer.setCustName("Vivek Gupta");
		 newCustomer.setAboutCustomer("I have experience in web development");
		 newCustomer.setCustAddress("Silvassa");
		 
		 return newCustomer;
	 }
	 
	 public Customer createCustomer(Customer customer) {
		 
		 Customer newCustomer = new Customer();
		 
		 newCustomer.setCustId(new Random().nextInt());
		 newCustomer.setCustName("Rahul Ranjan");
		 newCustomer.setAboutCustomer("I am very hard working software developer");
		 newCustomer.setCustAddress("Bihar");
		 
		 return newCustomer;
	 }

}
