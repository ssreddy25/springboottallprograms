package com.ojas.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.Where;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PLANS")
@NoArgsConstructor
@AllArgsConstructor

@SQLDelete(sql = "UPDATE Plans SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")

public class Plans {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int plansId;
	
	@Column(name = "NAME")
	private String name;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "STORAGE")
	private double storage;
//	@Column(name = "DESCRIPTION" ,columnDefinition = )
	 @Column(name = "DESCRIPTION" ,columnDefinition = "MEDIUMTEXT")
	 @Type(type = "org.hibernate.type.TextType")
	private String description;
	 
	 private boolean deleted = Boolean.FALSE;

	public int getPlansId() {
		return plansId;
	}

	public void setPlansId(int plansId) {
		this.plansId = plansId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getStorage() {
		return storage;
	}

	public void setStorage(double storage) {
		this.storage = storage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Plans [plansId=" + plansId + ", name=" + name + ", price=" + price + ", storage=" + storage
				+ ", description=" + description + "]";
	}
	
	
	
	
	
	
	

}
