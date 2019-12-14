package com.as.traficchallan.traficchallan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ChallansNotFoundException extends RuntimeException {

	public ChallansNotFoundException(String message) {
		super(message);
	}
}
