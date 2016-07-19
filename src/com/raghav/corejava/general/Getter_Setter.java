package com.raghav.corejava.general;


class Getter{

	private String fruit;

	public Getter(){
		fruit="mango";
	}

	public String getFruit() {
		return fruit;
	}

}


public class Getter_Setter {


	public static void main(String[] args) {

		System.out.println(new Getter().getFruit());

	}

}
