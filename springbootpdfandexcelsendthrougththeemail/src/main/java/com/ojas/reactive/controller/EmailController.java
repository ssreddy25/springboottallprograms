package com.ojas.reactive.controller;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.reactive.entity.Student;
import com.ojas.reactive.services.StudentServices;

@RestController
public class EmailController {
	
	@Autowired
	private StudentServices studentServices;
	
	public EmailController(StudentServices studentServices){
		this.studentServices=studentServices;
	}
	
	@PostMapping("/email")
	public void sendtheMail(@RequestBody List<Student> stu) throws IOException, MessagingException {
		
		studentServices.sendtheMail(stu);
	}

}
