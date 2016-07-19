package com.raghav.corejava.oops;

public class StaticDemo1 {
	static char staticVariable;
	int normalVariable;

	static{
		System.out.println("FIRST EXECUTES static block BEFORE MAIN");
	}

	public static void main(String[] args) {
	System.out.println("main method");
	 	StaticDemo1 sd=new StaticDemo1();
		System.out.println("Acessing static Variable without object : "+staticVariable);
		System.out.println("Acessing instance variable with object :"+sd.normalVariable);
	System.out.println("END of main method");
	int j=sd.normalMethod();
	System.out.println("Main method after returning from normal method");
	}


	public int normalMethod(){
	boolean b=false;
	while(!b){ // the condition is satisfied for false rather than true for true just give b or while(true).
	System.out.println("Non Static method");
		System.out.println("Acessing instance variable without object : "+normalVariable);
		System.out.println("Acessing static variable without object : "+staticVariable);
	System.out.println("END of Non static method");
	return normalVariable; // this returns hence escaped from infinite loop
	}
	return normalVariable;
	}
}
