package com.ojas.spring.services;

import java.util.List;

import com.ojas.spring.model.Book;

public interface BooKservieDao {
	
public Book createBook(int id,String bookName,String bookPrice);
	
	public int[] bookBatchInsert(List<Book> books);
	
	public int[] updateBook(List<Book> books);
	
	public String deleteBook(int id);
	
	public List<Book> listOfBook();

}
