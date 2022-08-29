package com.junit.spring.demo.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import com.junit.spring.demo.main.AppConfig;
import com.junit.spring.demo.obj.Customer;
import com.junit.spring.demo.service.CustomerService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class,loader=AnnotationConfigContextLoader.class)

public class JunitSimpleTesting {
	
	 @Autowired
	 private CustomerService customerService;
	 
	 
	 @BeforeClass
	 public static void setUp() {

	 System.out.println("-----> SETUP <-----");

	 }
	 
	 @Test
	 public void testCustomerService() {

	 assertEquals("class com.junit.spring.demo.service.CustomerServiceImpl",this.customerService.getClass().toString());

	 }
	 
	 @Test
	 public void testCustomerServiceGetCustomerAbout() {

	 //	Check if the return about has a 'About:' string.

	 assertTrue(customerService.getCustomerAbout().contains("About:"));

	 }
	 
	 @Test
	 public void testCustomerServiceGetCustomerAddress() {

	 //	Check if the return description has a 'Customer Address:' string.

	 assertTrue(customerService.getCustomerAddress().contains("Customer Address:"));

	 }
	 
	 
	 @Test
	 public void testCustomerServiceCreateNewCustomer() {

	 Customer newCustomer = new Customer();
	 
	 newCustomer.setCustAddress("Siwan");

	 newCustomer.setAboutCustomer("About");

	 if(newCustomer != null) {

	  assertThat(customerService.createCustomer(newCustomer), instanceOf(Customer.class));

	  assertNotNull("Address isn't null", newCustomer.getCustAddress());

	  assertNotNull("About isn't not null", newCustomer.getAboutCustomer());

	 }
}
	 
	 
	 @Test
	 public void testCustomereServiceGetCustomer() {

	 Customer existingCustomer = customerService.getCustomer(0);

	 if(existingCustomer != null) {

		  assertThat(customerService.getCustomer(0), instanceOf(Customer.class));
		  assertNotNull("Address isn't null", existingCustomer.getCustAddress());
		  assertNotNull("About isn't null", existingCustomer.getAboutCustomer());
	 }
	 assertNotNull("Object is not null", existingCustomer);
	 
  }
	 
	 
	 @AfterClass
	 public static void afterTest() {

	 System.out.println("-----> DESTROY <-----");

	 }
	
}
