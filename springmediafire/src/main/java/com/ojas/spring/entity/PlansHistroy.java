package com.ojas.spring.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="PLANSHISTROY")

public class PlansHistroy {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int planHistoryId;
	
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
	
	 @Column(name = "PUBLISHEDDATE")
	 private LocalDate  publishedDate;

	public int getPlanHistoryId() {
		return planHistoryId;
	}

	public void setPlanHistoryId(int planHistoryId) {
		this.planHistoryId = planHistoryId;
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

	

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}

	@Override
	public String toString() {
		return "PlansHistroy [planHistoryId=" + planHistoryId + ", name=" + name + ", price=" + price + ", storage="
				+ storage + ", description=" + description + ", publishedDate=" + publishedDate + "]";
	}
	 
	 

}
