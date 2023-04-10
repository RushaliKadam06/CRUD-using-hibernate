package com.jsp.custProduct.service;

import com.jsp.custProduct.dao.CustomerDao;
import com.jsp.custProduct.dto.Customer;

public class CustomerService {
	
	CustomerDao customerDao = new CustomerDao();
	
	public Customer saveCustomer(Customer customer) {
		if(customer!=null) {
		return customerDao.saveCustomer(customer);
		}else {
			return null;
		}
	}
	
	public Customer getCustomerById(int id) {
		if(id>0) {
			return customerDao.getCustomerById(id);
		}else {
			return null;
		}
	}
	
	public Customer updateCustomerName(int id,String name) {
	Customer customer =	customerDao.getCustomerById(id);
	customer.setCustName(name);
	return customerDao.updateCustomer(customer);
		
	}
	
	public Customer updateCustomerEmail(int id,String email) {
		Customer customer =	customerDao.getCustomerById(id);
		customer.setCustEmail(email);
		return customerDao.updateCustomer(customer);
		}
	
	public Customer updateCustomerProductId(int id,int productId) {
		Customer customer =	customerDao.getCustomerById(id);
		customer.setProductId(productId);
		return customerDao.updateCustomer(customer);
			
		}
	
	public void getAllById(int id) {
    	if(id>0) {
    	 customerDao.getAllById();
    	}else {
    		System.out.println("invalid id");
    	}
    }
	
    public void deleteCustomerById(int id) {
    	if(id>0) {
    	customerDao.deleteCustomerById(id);
    }else {
    	System.out.println("Invalid product");
    }

}

}
