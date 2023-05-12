package com.ojas.reactive.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ojas.reactive.dto.UserRequest;
import com.ojas.reactive.entity.User;
import com.ojas.reactive.exception.userNotfoundException;
import com.ojas.reactive.repository.UserRepository;

@Service
public class UserServics {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
//		UserRequest UserRequest1=new UserRequest();
//		User user =new User();
//		BeanUtils.copyProperties(UserRequest, user);
		
//		User user1= 
//		
//		BeanUtils.copyProperties(user1, UserRequest1);
		return userRepository.save(user);
		
		
	}
	
	  public List<User> getAllRequest(){
		
		return userRepository.findAll();
	}

	  public Optional<User> getUser(int id) throws userNotfoundException{
			
			
			
			 Optional<User> user =  userRepository.findById(id);
			 System.out.println(user);
	    	 if(!user.isEmpty()) {
	    		 return user;
	    	 }
	    	 else {
			 throw new userNotfoundException("user not found exception");
			}
	  }
		
	  
	  public User updateUser(User user ,int id) {
//		  Optional<User> user1=getUser(id);
		  
		  return userRepository.save(user);
	  }
}
