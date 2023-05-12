package com.ojas.dao;

import com.ojas.entity.User;

public interface UserDao {
	
	public String createUser(User user);
	
	public User loginUser(String email,String password);
	
	
	

}
