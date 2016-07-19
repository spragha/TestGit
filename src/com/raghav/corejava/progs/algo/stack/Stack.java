package com.raghav.corejava.progs.algo.stack;

public interface Stack<T> {
	public void push(T item);

	public T pop() throws StackEmptyException;

	public T top() throws StackEmptyException;

	public int size();

	public boolean isEmpty();
}