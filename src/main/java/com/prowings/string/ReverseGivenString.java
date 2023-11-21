package com.prowings.string;

public class ReverseGivenString {
	
	public static void main(String[] args) {
		
		String input = "ABC";
		
//		String output = reverse(input);
		String output = reverseUsingArray(input);
		
		System.out.println(output);
		
	}

	//way1:
	public static String reverse(String input) {
		
		StringBuffer sb = new StringBuffer(input);
		
		sb.reverse();
		
		return new String(sb);
	}

	//way2:
	public static String reverseUsingArray(String input) {
		
		char[] data = input.toCharArray();
		char[] res = new char[data.length];
		int counter = 0;
		
		for(int i=data.length-1; i>=0; i--)
		{
			res[counter] = data[i];
			counter++;
		}
		
		return new String(res);
	}

}
