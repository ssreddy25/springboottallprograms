package com.ojas.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.spring.dao.BookDaoImplementaion;
import com.ojas.spring.model.Book;

@Service
public class BookServices  implements BooKservieDao{
	
	@Autowired
	private BookDaoImplementaion bookDaoImplementaion;
	
	
   public Book createBook(int id,String bookName,String bookPrice) {
	   
	   return null;
   }
   
	
	public int[] bookBatchInsert(List<Book> books) {
		
		books.forEach(System.out::println);
		
		return bookDaoImplementaion.bookBatchInsert(books);
	}
	
	public int[] updateBook(List<Book> books) {
		
		return bookDaoImplementaion.updateBook(books);
		
	}
	
	public String deleteBook(int id) {
		
		return null;
		
	}
	
	public List<Book> listOfBook(){
		
		return null;
		
	}
	
	

}
