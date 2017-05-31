package com.sample.account.services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends RuntimeException{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4634835170506693046L;

	public AccountNotFoundException(String accountNumber){
		super("No such account number: "+accountNumber);
		
	}

}