package com.ojas.springmvc.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	
	private int produtId;
	private String productName;
	private int  productQty;
	private int productPrice;

}
