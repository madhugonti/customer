package com.example.demo.myControlleradvices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.exceptions.CustomerIdNotFound;

@ControllerAdvice
public class MyExceptions {
     @ExceptionHandler(CustomerIdNotFound.class)
	public ResponseEntity<Object> getCustomerIdNotfound(CustomerIdNotFound e) {
		return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);

	}
}
