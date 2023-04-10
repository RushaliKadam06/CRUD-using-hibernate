package com.jsp.custProduct.service;

import com.jsp.custProduct.dao.ProductDao;
import com.jsp.custProduct.dto.Product;

public class ProductService {
	
	ProductDao productDao = new ProductDao();
	
	public Product saveProduct(Product product) {
		if(product!=null) {
			if (product.getProductQuantity()<1) {		
				return null;			
			}
		}
		return productDao.saveProduct(product);
		
	}
	
	public Product getProductById(int id) {
		if(id>0) {
			return productDao.getProductById(id);
		}else {
			return null;
		}
	}
	
    public Product updateProductName(int id,String name) {
    	
    	Product product2=productDao.getProductById(id);
    	product2.setProductName(name);
    	return productDao.updateProductById(product2);
    	
    }
public Product updateProductBrand(int id,String brand) {
    	
    	Product product2=productDao.getProductById(id);
    	product2.setBrand(brand);
    	return productDao.updateProductById(product2);
    	
    }

public Product updateProductQuantity(int id,int productQuantity) {
	
	Product product2=productDao.getProductById(id);
	product2.setProductQuantity(productQuantity);
	return productDao.updateProductById(product2);
	
}

public Product updateProductPrice(int id,double price) {
	
	Product product2=productDao.getProductById(id);
	product2.setPrice(price);
	return productDao.updateProductById(product2);
	
}
    
    public void getAllById(int id) {
    	if(id>0) {
    	 productDao.getAllById();
    	}else {
    		System.out.println("invalid id");
    	}
    }
	
	
    public void deleteProductById(int id) {
    	if(id>0) {
    	productDao.deleteProductById(id);
    }else {
    	System.out.println("Invalid product");
    }

}
}
