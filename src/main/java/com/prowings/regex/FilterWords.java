package com.prowings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterWords {

	public static void main(String[] args) {

		String text = "The cat and the dog chased a ball. Can you count the cats?";

		// Define the regex pattern to match words starting with 'c'
		Pattern pattern = Pattern.compile("\\b[cC]\\w+\\b");
//		Pattern pattern = Pattern.compile(".*^[cC].*");

		// Create a matcher for the input text
		Matcher matcher = pattern.matcher(text);

		// Find and print all matches
		while (matcher.find()) {
			System.out.println("Found: " + matcher.group());
		}

	}

}
