package com.jsp.custProduct.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.custProduct.dto.Customer;



public class CustomerDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rushali");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Customer saveCustomer(Customer customer) {
		
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		return customer;
	}
	
	public Customer getCustomerById(int id) {
		Customer customer = entityManager.find(Customer.class, id);
		return customer;
	}
	
	public Customer updateCustomer(Customer customer) {
		if(customer!=null) {
	    entityTransaction.begin();
		entityManager.merge(customer);
		entityTransaction.commit();
		}
		return customer;
	}
	
	public void getAllById() {
		String sql="select s from Customer s";
	    Query query =	entityManager.createQuery(sql);
        List<Customer> customer = query.getResultList();
        
        for(Customer cust : customer) {
     	   System.out.println(cust.getCustId());
     	   System.out.println(cust.getCustName());
     	   System.out.println(cust.getCustEmail());
     	   System.out.println(cust.getProductId());
     	   System.out.println("==================="); 
        }
    
	}
	
	public void deleteCustomerById(int id) {
		Customer customer =	entityManager.find(Customer.class, id);
		entityTransaction.begin();
	    entityManager.remove(customer);
	    entityTransaction.commit();
		}

}
