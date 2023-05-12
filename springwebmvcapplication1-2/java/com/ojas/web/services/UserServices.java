package com.ojas.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.web.model.User;
import com.ojas.web.repositery.UserRepositery;

@Service
public class UserServices {
	
	@Autowired
	private UserRepositery userRepositery;
	
	public String saveUser(User user) {
		
		User u=userRepositery.save(user);
		
		if(u!=null) {
			return "your registration sucessfully";
		}
		else {
			return "try agin ";
		}
		
	}

}
