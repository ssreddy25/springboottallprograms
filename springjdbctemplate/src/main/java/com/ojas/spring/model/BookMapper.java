package com.ojas.spring.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int i) throws SQLException {
		
		Book book=new Book();
		
		book.setId(rs.getInt("id"));
		book.setBookName(rs.getString("bookName"));
		book.setBookPrice(rs.getString("bookPrice"));
		
		return book;
	}

}
