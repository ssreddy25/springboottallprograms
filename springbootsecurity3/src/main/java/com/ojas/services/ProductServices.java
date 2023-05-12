package com.ojas.services;


import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ojas.entity.Product;
import com.ojas.entity.UserInfo;
import com.ojas.exception.ProductNotFuondException;
import com.ojas.repository.UserInfoRepositry;

@Service
public class ProductServices {
	
	 List<Product> product =null;
	 
	 @Autowired
	 private UserInfoRepositry infoRepositry;
	 
	 @Autowired
	 private PasswordEncoder passwordEncoder;
	 
	@PostConstruct
	public void createProducts() {
		
	   product = IntStream.range(1, 100)
			   .mapToObj(i ->
				   Product.builder().id(i)
				   .name("product"+i)
				   .qty(new Random().nextInt(10)+1)
				   .price(new Random().nextInt(5000)).build()
				   ).collect(Collectors.toList());
			   
			   
	}
	 
	 public List<Product> getProduct(){
		 return product;
	 }
	 
	 public  Optional<Product> getProductId(int id) throws ProductNotFuondException {
		 
		 Optional<Product> produc =product.stream()
				 .filter(i->i.getId()==id)
				 .findAny();
				 
		 if(produc.isEmpty()) {
			 throw new ProductNotFuondException("productNotfountd by"+id);
		 }
		 
		 return produc;
	 }
	 
	 public String adduser(UserInfo userInfo) throws ProductNotFuondException {
		 userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
		 
		 UserInfo save = infoRepositry.save(userInfo);
		 if(save==null) {
			 
			 throw new ProductNotFuondException("user not save inthe db");
		 }
		 return "user inserted db";
	 }

}
