package com.raghav.corejava.java_util;

import java.util.HashMap;
import java.util.HashSet;

public class HashXQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean b;
		HashSet<String> set = new HashSet<String>();
		b=set.add("raghavan");
		b=set.add("raghavan");
		
		Object obj;
		String str;
		
		HashMap<Integer,String> hm=new HashMap(); 
		hm.put(1, "Raghavan");
		hm.put(2, "Raghavan");
		hm.put(1, "Raghavan");
		System.out.println(hm.remove(1));
	}

}
