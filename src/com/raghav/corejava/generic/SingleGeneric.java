package com.raghav.corejava.generic;


public class SingleGeneric<T> {

	private T type;

	public SingleGeneric(T type ){
		this.type=type;
	}
	 public void setType(T type ){
		 this.type=type;
	 }
	public T getType() {
		return this.type;
	}

}
