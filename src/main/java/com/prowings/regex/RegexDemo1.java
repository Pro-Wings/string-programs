package com.prowings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
	
	public static void main(String[] args) {
		
		String input = "helloworld";
		String input2 = "worldhello";
		
		String pattern = ".*world$";
		String pattern2 = "^world.*";
		
		Pattern p = Pattern.compile(pattern2);
		
		Matcher m = p.matcher(input2);
		
		if(m.matches())
			System.out.println("Match Found!!");
		else
			System.out.println("Match Not Found!!");
		
	}

}
