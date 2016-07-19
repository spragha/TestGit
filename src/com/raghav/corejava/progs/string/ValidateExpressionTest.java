package com.raghav.corejava.progs.string;

import java.util.Scanner;
import java.util.Stack;


public class ValidateExpressionTest {

	static final String YES = "YES";
	static final String NO = "NO";
	
	private static String validateExpression(String expression) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			switch (ch) {
			case '{':
			case '[':
			case '(':
				stack.push(ch);
				break;
			case '}':
				if (stack.isEmpty() || stack.pop() != '{')
					return NO;
				break;
			case ']':
				if (stack.isEmpty() || stack.pop() != '[')
					return NO;
				break;
			case ')':
				if (stack.isEmpty() || stack.pop() != '(')
					return NO;
				break;
			default:
				return NO;
			}
		}

		return stack.isEmpty() ? YES : NO;	
	}

	public static void main(String[] args) {
		
		/*Scanner in = new Scanner(System.in);

		int numberOfTestCases = Integer.parseInt(in.nextLine());
		String[] expressions = new String[numberOfTestCases];
		for (int i = 0; i < numberOfTestCases; i++) {
			expressions[i] = in.nextLine();
		}*/

		/*for (int i = 0; i < numberOfTestCases; i++) {
			System.out.println(validateExpression(expressions[i]));
		}
*/
		//in.close();
		System.out.println(validateExpression("{(}"));
	}
}
