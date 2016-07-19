package com.raghav.corejava.generic;


public class NonGeneric<K,V> {
	private Object key;
	private Object value;

	public NonGeneric(Object k,Object v) {
		key=k;
		value=v;
	}

	public Object getKey(){
		return key;
	}

	public Object getValue(){
		return value;
	}
}
