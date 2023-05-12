package com.ojas.advice;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ojas.exception.ProductNotFuondException;

@RestControllerAdvice
public class ControllerException {

	@ExceptionHandler(ProductNotFuondException.class)
	public String productException(ProductNotFuondException e) {

		return e.getMessage();
	}

	@ExceptionHandler(UsernameNotFoundException.class)
	public String productException(UsernameNotFoundException s) {

		return s.getMessage();
	}

}
