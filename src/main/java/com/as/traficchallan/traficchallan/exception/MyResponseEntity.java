package com.as.traficchallan.traficchallan.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class MyResponseEntity extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		ExceptionResponse er = new ExceptionResponse(new Date(), ex.getMessage(), request.getSessionId(),HttpStatus.INTERNAL_SERVER_ERROR);
		
		return new ResponseEntity(er, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(ChallansNotFoundException.class)
	public final ResponseEntity<Object> handleChallanNotFoundExceptions(ChallansNotFoundException ex, WebRequest request) {
		ExceptionResponse er = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(true),HttpStatus.NOT_FOUND);
		
		return new ResponseEntity(er, HttpStatus.NOT_FOUND);
	}

}
