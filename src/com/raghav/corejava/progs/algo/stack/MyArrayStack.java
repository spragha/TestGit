package com.raghav.corejava.progs.algo.stack;

public class MyArrayStack<T> implements Stack<T> {

	private Object[] elements;

	private final static int DEFAULT_CAPACITY = 16;

	private int capacity;

	private int top = -1;

	public MyArrayStack(int capacity) {
		this.capacity = capacity;
		elements = new Object[capacity];
	}

	public MyArrayStack() {
		this.capacity = DEFAULT_CAPACITY;
	}

	@Override
	public void push(T item) {
		if (size() == capacity)
			throw new StackFullException();
		elements[++top] = item;
	}

	@Override
	public T pop() throws StackEmptyException {
		if (top == -1)
			throw new StackEmptyException();
		T element = (T) elements[top];
		elements[top--] = null;
		return element;
	}

	@Override
	public T top() throws StackEmptyException {
		if (top == -1)
			throw new StackEmptyException();
		return (T) elements[top];
	}

	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public boolean isEmpty() {
		return top == -1 ? true : false;
	}
}