package com.prowings.string;

public class PalindromeString {

	public static void main(String[] args) {

		String input = "Radar";

		String output = isPalindrome(input) ? "PALINDROME" : "NOT-PALINDROME";

		System.out.println(output);
	}

	private static boolean isPalindrome(String input) {

		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		String reversedString = new String(sb);
		return input.equalsIgnoreCase(reversedString);

	}

}
