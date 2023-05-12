package com.ojas.dao;

import com.ojas.modal.User;

public interface UserDao {
	
	public String createUser(User user);
	
	public User userLogin(String userEmail ,String passWord);
	
	public User userForgetPassword(String userName ,String userEmail);
	

}
