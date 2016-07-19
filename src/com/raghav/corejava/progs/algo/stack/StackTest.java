package com.raghav.corejava.progs.algo.stack;

public class StackTest {

	public static void main(String[] args) {
		MyArrayStack<Integer> stack = new MyArrayStack<>(4);
		checkStackEmpty(stack);
		try {
			pushOnStackUntillStackIsFull(stack);
		} catch (StackFullException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Stack content : ");
		//stack.print();
		System.out.println("Popping out : ");
		try {
			popElements(stack);
		} catch (StackEmptyException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void popElements(MyArrayStack<Integer> stack) {
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

	private static void pushOnStackUntillStackIsFull(MyArrayStack<Integer> stack) {
		stack.push(4);
		stack.push(7);
		stack.push(3);
		stack.push(9);
		stack.push(2);
	}

	private static void checkStackEmpty(MyArrayStack<Integer> stack) {
		System.out.println("Is stack empty : " + stack.isEmpty());
	}
}