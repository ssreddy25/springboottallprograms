package com.ojas.springmvc.services;

import com.ojas.springmvc.model.Product;

public interface ProductServices {
	
	
	public String addProduct(Product product);
	
	public Product getProductById(int id);
	
	public void deleteProduct(int id);
	
	

}
