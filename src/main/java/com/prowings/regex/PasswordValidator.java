package com.prowings.regex;

import java.util.regex.Pattern;


/**
 * @author Shree
 * 
 *In this example, used regex will enforce these rules:
  At least one upper case English letter, (?=.*?[A-Z])
  At least one lower case English letter, (?=.*?[a-z])
  At least one digit, (?=.*?[0-9])
  At least one special character, (?=.*?[#?!@$%^&*-])
  Minimum eight in length .{8,} (with the anchors)
 *
 */
public class PasswordValidator {
	
	
	public static void main(String[] args) {
		
		
		String inputPwd = "Abc@12345";
		
		if(passwordValidation(inputPwd))
			System.out.println("Valid Password!!!");
		else
			System.out.println("Invalid Password!!!");
		
	}
	
	
	public static boolean passwordValidation(String password)
	{
		String pwdPattern = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
		
//		Pattern p = Pattern.compile(pwdPattern);
//		
//		Matcher m = p.matcher(password);
//		
//		return m.matches();
		
		return Pattern.matches(pwdPattern, password);

	}

}
