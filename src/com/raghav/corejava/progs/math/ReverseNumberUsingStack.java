package com.raghav.corejava.progs.math;

import java.util.Stack;

public class ReverseNumberUsingStack {

		private static int reverseUsingStack(int number) {
			Stack<Integer> stack = pushDigitsOnStack(number);
			
			int reverse = 0;
			int i = 1;
			
			while (!stack.isEmpty()) {
				reverse += stack.pop() * i;
				i *= 10;
			}
			return reverse;
		}

		private static Stack<Integer> pushDigitsOnStack(int number) {
			Stack<Integer> stack = new Stack<Integer>();
			while (number != 0) {
				stack.push(number % 10);
				number /= 10;
			}
			return stack;
		}

		public static void main(String[] args) {
			int number = 12345;
			int n=number;
			int temp=0;
			while(n!=0){
				temp=temp*10+n%10;
				n=n/10;
			}
			System.out.println(temp);
			//int reverse = reverseUsingStack(number);
		//	System.out.println("Reverse of " + number + " is " + reverse);
		}

}
