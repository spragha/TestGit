package com.raghav.corejava.oops;


public class MainClass {

	public static void main(String[] args) {
		MySingleton ms=MySingleton.getInstance();

		MainClass ci = new MainClass();
		System.out.println("ClassInterface"+ci);
		System.out.println("Main String array"+args);
	}

}
