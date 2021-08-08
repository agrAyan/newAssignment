package com.userapp.service;

import com.userapp.exception.NameExistException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class Validation {
	String [] names= {"AYAN","AYUSH","RAM"};
	public boolean validateUsername(String username) throws NameExistException{
	
		boolean check= false;
		for(String name: names) {
			if(name.equals(username))
				check= true;
		}
		if( check) {
			throw new NameExistException("name is already exist");
		}
		else
			return check;
		}
		
	
	 
	public boolean validatePassword(String password) throws TooShortException,TooLongException{
	if(password.length()<6) {
		throw new TooShortException ("password is too short");
	}
	else if(password.length()>15) {
		throw new TooLongException("password is too long");
	}
	else
		return true;
		
	 }
	 
	 
	 }
