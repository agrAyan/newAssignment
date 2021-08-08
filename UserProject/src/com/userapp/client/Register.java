package com.userapp.client;

import java.util.Scanner;

import com.userapp.exception.NameExistException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.Validation;

public class Register {

	public static void main(String[] args) throws NameExistException, TooShortException, TooLongException {
		// TODO Auto-generated method stub
		
		Scanner kb= new Scanner(System.in);
		System.out.println("enter name ");
		String name= kb.next();
		Validation  v= new Validation();
		try {
		boolean checkName= v.validateUsername(name);
		//System.out.println(checkName);
		if(!checkName) {
			System.out.print("Enter password");
			String password= kb.next();
			boolean checkPass= v.validatePassword(password);
			if(checkPass)
				System.out.println("welcome user");
		}
		}
		catch(NameExistException e) {
			System.out.println(e.getMessage());
		}
		catch(TooShortException e) {
			System.out.println(e.getMessage());
		}
		catch(TooLongException e) {
			System.out.println(e.getMessage());
		}
	}

}
