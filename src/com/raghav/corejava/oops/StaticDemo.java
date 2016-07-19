package com.raghav.corejava.oops;

class static1 {

	static {
		System.out.println("static block of static1 class");
	}

	int i = 10;
	String str = "raghavan";
	static int x = 100;  // it gets the memory only once at the time of class loading

	public static void demo() { 	// it can access only the static member
		int y = x;
		System.out.println(y);
		//normal(); 				// we cant call non static method from static method
	}
	public void normal(){
		System.out.println("normal method");
	}

}

public class StaticDemo {
	static {							// used to intialize static data member and to execute some thing before main
		System.out.println("static block");
	}

	public static void main(String[] args) {  // it is static because no need to create object for calling the method by JVM
		System.out.println("main method");
		static1.demo();

	}

}
