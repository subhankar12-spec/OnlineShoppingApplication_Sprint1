package com.cg.onlineshopping.exceptions.user;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Exception {
	
	public UserNotFoundException(String str)
	{
		super(str);
	}

}
