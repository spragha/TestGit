package com.raghav.corejava.java_util.mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class HashMapHandling {

	public static void main(String args[]) {

		System.out.println("Hash Map Demo");
		// Create a hash map
	      HashMap hm = new HashMap();
	      // Put elements to the map
	      hm.put("Zara", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));

	      HashMap hm1=hm;
	     boolean mapContains= hm.equals(hm1);
	     
	     System.out.println(mapContains);
	      
	      // Get a set of the entries
	      Set set = hm.entrySet();

	      // Get an iterator
	      Iterator<Map.Entry> i = set.iterator();

	      //Iterator<String> i1 = hm.keySet().iterator();
	      //Iterator i1=hm.entrySet().iterator();

	      // Display elements
	      while(i.hasNext()) {
	    	 //String key=i1.next();
	         Map.Entry me =i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      
	    /*  for(Entry entry : hm.entrySet()){
	    	  
	      }*/
	      System.out.println();
	      // Deposit 1000 into Zara's account
	      //double balance = ((Double)hm.get("Zara")).doubleValue();
	      double balance = (Double)hm.get("Zara");
	      hm.put("Zara", new Double(balance + 1000));
	      System.out.println("Zara's new balance: " +
	      hm.get("Zara"));
	   }
}

