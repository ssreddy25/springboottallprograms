package com.ojas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CUSTOMER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int customerId;

	private String customerName;
	
	private String customerEmail;
	
	private String customerNewPassword;
	
	private String customerConPassword;
	
	private double customerWalletAmout;
	
	@OneToMany(cascade=CascadeType.ALL)
	@Column(name="orders")
	private List<Product> product;

}
