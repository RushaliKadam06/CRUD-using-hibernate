package com.jsp.custProduct.controller;


import com.jsp.custProduct.dto.Product;
import com.jsp.custProduct.service.ProductService;

public class ProductDriver {
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setProductName("Watch");
		p1.setBrand("baggit");
		p1.setPrice(400);
		p1.setProductQuantity(1);
		
	 ProductService c1 = new ProductService();
	 c1.deleteProductById(4);
	 
	}

}
