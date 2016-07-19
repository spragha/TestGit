package com.raghav.spring;

public class WelcomeBean {

	public String welcome;

	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}
	public void display(){
		System.out.println(welcome);
	}
}
