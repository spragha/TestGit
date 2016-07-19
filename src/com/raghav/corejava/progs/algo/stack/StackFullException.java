package com.raghav.corejava.progs.algo.stack;

public class StackFullException extends RuntimeException {
	public StackFullException() {
		super("Stack is full.");
	}

	public StackFullException(String message) {
		super(message);
	}
}