package com.prowings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdValidation {
	
	public static void main(String[] args) {
		
		String input = "abc@gmail.com";
		
		if(validEmail(input))
			System.out.println("Valid Email!!!");
		else
			System.out.println("Invalid Email!!!");
		
	}

	public static boolean validEmail(String inputEmail) {
		
		String emailPattern = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		
		Pattern p = Pattern.compile(emailPattern);
		
		Matcher m = p.matcher(inputEmail);
		
		return m.matches();

	}

}
