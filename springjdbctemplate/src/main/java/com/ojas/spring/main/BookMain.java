package com.ojas.spring.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.ojas.spring.configuration.Springconfig;
import com.ojas.spring.dao.BookDao;
import com.ojas.spring.model.Book;
import com.ojas.spring.services.BooKservieDao;
import com.ojas.spring.services.BookServices;

public class BookMain {
	
	
	

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Springconfig.class);
		
		// BookServices bookServices =new  BookServices();
		
		 BooKservieDao bookss=applicationContext.getBean(BookServices.class);
		 
		 Book book=new Book();
		
		book.setId(6);
		book.setBookName("mana");
		book.setBookPrice("100");
		 Book book1=new Book();
		
		book1.setId(7);
		book1.setBookName("mana");
		book1.setBookPrice("100");
		 Book book2=new Book();
			
		book2.setId(8);
		book2.setBookName("mana");
		book2.setBookPrice("100");
		 Book book3=new Book();
		book3.setId(9);
		book3.setBookName("mana");
		book3.setBookPrice("100");
		 Book book4=new Book();
		book4.setId(10);
		book4.setBookName("mana");
		book4.setBookPrice("100");
		
		List<Book> books=new ArrayList<>();
		books.add(book);
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		
		books.forEach(System.out::println);
		
		System.out.println(bookss.bookBatchInsert(books));
		
		

	}

}
