package com.raghav.corejava.progs.algo.stack;

public class StackEmptyException extends RuntimeException {

	public StackEmptyException() {
		super("Stack is Empty.");
	}

	public StackEmptyException(String message) {
		super(message);
	}
}