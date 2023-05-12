package com.ojas.spring.model;

import org.springframework.stereotype.Component;


public class Book {
	
	private int id;
	private String bookName;
	private String bookPrice;
	
	public Book() {
		
	}

	public Book(int id, String bookName, String bookPrice) {
		
		this.id = id;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
	

}
