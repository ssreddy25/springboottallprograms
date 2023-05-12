package com.ojas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id
	private int productId;
	private String productName;
	private double produPrice;
	private int productQuntity;

}
