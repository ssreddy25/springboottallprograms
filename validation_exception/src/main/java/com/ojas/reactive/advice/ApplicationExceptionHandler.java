package com.ojas.reactive.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ojas.reactive.exception.userNotfoundException;

@RestControllerAdvice
public class ApplicationExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleEception(MethodArgumentNotValidException e) {

		Map<String, String> errorMap = new HashMap<>();

		e.getBindingResult().getFieldErrors().forEach(error -> {
			errorMap.put(error.getField(), error.getDefaultMessage());
		});

		return errorMap;

	}
	@ExceptionHandler(userNotfoundException.class)
	public Map<String,String> usernotfoundException(userNotfoundException u){
		Map<String, String> errorMap = new HashMap<>();
		
		errorMap.put("error message", u.getMessage());
		return errorMap;
		
		
		
		
	}

}
