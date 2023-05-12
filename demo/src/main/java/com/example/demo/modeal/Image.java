package com.example.demo.modeal;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;


@Entity
public class Image {
	
	@Id
	private String id;
	private String name;
	private String type;
	
	@Lob
	private byte[] data;

	public Image(String id, String name, String type, byte[] data) {
		
		this.id = id;
		this.name = name;
		this.type = type;
		this.data = data;
	}

	public Image() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", name=" + name + ", type=" + type + ", data=" + Arrays.toString(data) + "]";
	}
	
	
	
	
	
	

}
