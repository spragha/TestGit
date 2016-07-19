package com.raghav.corejava.progs.array;
//Check if characters of a given string can be rearranged to form a palindrome
public class PalindromeSolution {

	private static boolean canMakeAPalindrome(String testStr) {
		int[] frequencyArr = createFrequencyArray(testStr);

		int oddCharCount = 0;

		for (int ch : frequencyArr) {

			// Count characters with odd occurrence.
			if (ch % 2 != 0)
				oddCharCount++;

			// If more than one character in the string has odd occurrence then
			// palindrome cannot be formed from given string
			if (oddCharCount > 1)
				return false;
		}

		return true;
	}

	private static int[] createFrequencyArray(String testStr) {
		int[] frequencyArr = new int[256];

		char[] charArray = testStr.toCharArray();

		for (char ch : charArray)
			frequencyArr[ch]++;

		return frequencyArr;
	}

	public static void main(String[] args) {
		String testStr = "KKAABC";

		System.out.println("Can palindrome be formed from '" + testStr
				+ "' ? : " + canMakeAPalindrome(testStr));
	}


}
