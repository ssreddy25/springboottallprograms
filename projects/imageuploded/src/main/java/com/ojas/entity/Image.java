package com.ojas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Image {
	
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int quntity;
	private double price;
	@Lob
	private byte[] data;

}
