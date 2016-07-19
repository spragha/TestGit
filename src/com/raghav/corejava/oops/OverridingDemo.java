package com.raghav.corejava.oops;

class Childd {

	public static void methodDemo() {
		System.out.println("Super method");
	}

	public void methodDemo1() {
		System.out.println("Super methodDemo1");
	}
}

public class OverridingDemo extends Childd {

	OverridingDemo od;

	public static void methodDemo() {
		System.out.println("subclass method");
	}

	public void methodDemo1() {
		System.out.println("subclass methodDemo1");
	}

	public void general(OverridingDemo od) {
		this.od = od;

		super.methodDemo();
		methodDemo();
		super.methodDemo1();
		methodDemo1();

	}

	public static void main(String[] args) {
		OverridingDemo od = new OverridingDemo();
		od.methodDemo1();
		od.general(od);
		methodDemo();
	}

}
