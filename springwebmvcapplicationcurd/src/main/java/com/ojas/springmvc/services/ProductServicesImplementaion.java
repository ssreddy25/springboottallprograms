package com.ojas.springmvc.services;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.springmvc.entity.ProductEntity;
import com.ojas.springmvc.model.Product;
import com.ojas.springmvc.repositroy.ProductRepositery;

@Service
public class ProductServicesImplementaion  implements ProductServices {
	
	@Autowired
	private ProductRepositery repositery;

	@Override
	public String addProduct(Product product) {
		
		ProductEntity pro=new ProductEntity();
		
		BeanUtils.copyProperties(product, pro);
		
		ProductEntity Product1=repositery.save(pro);
		if(Product1!=null) 
			return "product inserted into a data base";
		else
		return "product not inserted ";
	}

	@Override
	public Product getProductById(int id) {
		
		return null;
	}

	@Override
	public void deleteProduct(int id) {
//		Optional<Product> pro=repositery.findById(id);
		
		repositery.deleteById(id);
           
		
		
	}

}
