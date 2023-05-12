package com.ojas.spring.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import com.ojas.spring.model.Book;

@Repository
public class BookDaoImplementaion implements BookDao {
	

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public BookDaoImplementaion(DataSource dataSource) {
		
		jdbcTemplate=new JdbcTemplate(dataSource);
		
	}

	@Override
	public Book createBook(int id, String bookName, String bookPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] bookBatchInsert(List<Book> books) {
		books.forEach(System.out::println);
		
		int[] isert= jdbcTemplate.batchUpdate("insert into book(id,bookName,bookPrice) values(?,?,?)", new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				
				ps.setInt(1, books.get(i).getId());
				ps.setString(2, books.get(i).getBookName());
				ps.setString(3, books.get(i).getBookPrice());
				
			}

			@Override
			public int getBatchSize() {
				
				return books.size();
			}
			
		});
		return isert;
	}

	@Override
	public int[] updateBook(List<Book> books) {
		
		return jdbcTemplate.batchUpdate("update book set(bookName=?,bookPrice=?) where id=?)", new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				
			ps.setString(1, books.get(i).getBookName());
			ps.setString(2, books.get(i).getBookPrice());
			ps.setInt(3, books.get(i).getId());
			}
			
			
			@Override
			public int getBatchSize() {
				// TODO Auto-generated method stub
				return books.size();
			}
		
			
		});
	}

	@Override
	public String deleteBook(int id) {
		
		return null;
	}

	@Override
	public List<Book> listOfBook() {
		
		return null;
	}

}
