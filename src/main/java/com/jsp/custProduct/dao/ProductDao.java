package com.jsp.custProduct.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.custProduct.dto.Product;


public class ProductDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rushali");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Product saveProduct(Product product) {
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		
		return product;
	}
	
	public Product updateProductById(Product product) {
		if(product!=null) {
	    entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();
		}
		return product;
	}
	
	public void deleteProductById(int id) {
	Product product =	entityManager.find(Product.class, id);
	entityTransaction.begin();
    entityManager.remove(product);
    entityTransaction.commit();
	}
	
	public void getAllById() {
		String sql="select s from Product s";
	    Query query =	entityManager.createQuery(sql);
        List<Product> product = query.getResultList();
        
        for(Product p : product) {
     	   System.out.println(p.getProductId());
     	   System.out.println(p.getBrand());
     	   System.out.println(p.getPrice());
     	   System.out.println(p.getProductName());
     	   System.out.println(p.getProductQuantity());
     	   System.out.println("==================="); 
        }
    
	}
	
	public Product getProductById(int id) {
	 Product product =	entityManager.find(Product.class, id);
	 return product;
	 
	 
	}
	
	

}
