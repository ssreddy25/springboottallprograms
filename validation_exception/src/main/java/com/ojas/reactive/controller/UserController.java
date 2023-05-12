package com.ojas.reactive.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.reactive.entity.User;
import com.ojas.reactive.exception.userNotfoundException;
import com.ojas.reactive.services.UserServics;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServics userServics;
	
	@PostMapping("/")
	public ResponseEntity<User> saveUser(@RequestBody @Valid User user) {

		return new ResponseEntity<>(userServics.saveUser(user),HttpStatus.CREATED);
		
		
	}
	@GetMapping("/all")
	  public ResponseEntity<List<User>> getAllRequest(){
		
		return  ResponseEntity.ok(userServics.getAllRequest());
	}
     @GetMapping("/{id}")
	  public ResponseEntity<Optional<User>> getUser(@PathVariable int id) throws userNotfoundException{
    	 
           return ResponseEntity.ok(userServics.getUser(id));
    	
		}
	  
     @PutMapping("/{id}")
	  public User updateUser(User user ,int id) {
		 
		  
		  return userServics.updateUser(user ,id);
	  }

}
