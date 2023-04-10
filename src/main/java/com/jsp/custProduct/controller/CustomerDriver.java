package com.jsp.custProduct.controller;

import com.jsp.custProduct.dto.Customer;
import com.jsp.custProduct.service.CustomerService;

public class CustomerDriver {
	
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		Customer c1 = new Customer();
		c1.setCustName("Rushali");
		c1.setCustEmail("xyz@gmail.com");
		c1.setProductId(3);
		
	   Customer customer = new Customer();
	   customerService.deleteCustomerById(1);
	   
	    
	}

}
