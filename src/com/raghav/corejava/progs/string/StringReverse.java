package com.raghav.corejava.progs.string;

public class StringReverse {

	public static void main(String[] args) {
		String testString = "Crunchify.com Example";
		System.out.println("String: " + testString);
		System.out.println("\nReverse Using reverseStringBuffer: "
				+ reverseStringBuffer(testString));
		System.out.println("Reverse Using reverseCharArray: "
				+ reverseCharArray(testString));
		System.out.println("Reverse Using reverseStringVariable: "
				+ reverseStringVariable(testString));
		System.out.println("Reverse Using reverseRecursion: "
				+ reverseRecursion("BAKYARAJ Velu"));
	}

	public static String reverseStringBuffer(String s) {
		return new StringBuffer(s).reverse().toString();
	}

	public static String reverseCharArray(String s) {
		char[] reverseStringArray = new char[s.length()];
		for (int i = s.length() - 1, j = 0; i != -1; i--, j++) {
			reverseStringArray[j] = s.charAt(i);
		}
		return new String(reverseStringArray);
	}

	public static String reverseStringVariable(String s) {
		String reverseStringVariable = "";
		for (int i = s.length() - 1; i != -1; i--) {
			reverseStringVariable += s.charAt(i);
		}
		return reverseStringVariable;
	}

	public static String reverseRecursion(String s) {
		if (s.length() <= 1) {
			return s;
		}
		return reverseRecursion(s.substring(1, s.length())) + s.charAt(0);
	}
}
