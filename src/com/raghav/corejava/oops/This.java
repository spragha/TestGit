package com.raghav.corejava.oops;

class Child {

	int i;
	String str;
	public boolean b;

	Child() {
		System.out.println("Default constructor");
	}

	This obj;
	Child(This t) {
		this.obj=t;
	}

	Child(int i, String str) {
		this(); // calls default constructor
		this.i = i;
		this.str = str;
		System.out.println(i + " " + str);
	}

	Child(int i, String str, boolean b) {
		this(i, str); // it calls two argument constructor implicitly
		this.b = b;
		System.out.println(i + " " + str + " " + b);
	}

	public void test() {
		status(this); // implicitly compiler calls as this.status(Child c);
	}

	public Child status(Child c) {
		this.test();    // no need to give this
		return this;	// this is used to return instance of the classs
	}

}

public class This {

	int integer=100;

	This() {
		Child c2 = new Child(this);
	}

	public static void main(String[] args) {
		Child c = new Child(1, "raghavan");
		Child c1 = new Child(2, "ragha", true);
		This t = new This();

	}

}
