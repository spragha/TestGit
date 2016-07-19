package com.raghav.corejava.regular_expression;

import java.util.Scanner;

public class RegularExpression {

	public RegularExpression() {
		System.out.println(" Enter the String for RE :");
		String s=new Scanner(System.in).next();
	// Simpler from form 	return s.matches("[a-Z][a-Z][a-Z]");
		s.matches("[a-zA-Z]{3}");

	// Returns true if the string does not have a number at the beginning
		s.matches("^[^\\d].*");

	// Returns true if the string contains a arbitrary number of characters except b
	   s.matches("([\\w&&[^b]])*");

	// Returns true if the string contains a number less then 300
	   s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");

	}



	public static final String EXAMPLE_TEST = "This is my small example "
			+ "string which I'm going to " + "use for pattern matching?";

	public static void main(String[] args) {

		System.out.println(EXAMPLE_TEST.matches("\\w.*"));
		String[] splitString = (EXAMPLE_TEST.split("\\s+"));
		System.out.println(splitString.length);// Should be 14
		for (String string : splitString) {
			System.out.println(string);
		}

		// Replace all whitespace with tabs
		System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));

		new RegularExpression();
	}
}