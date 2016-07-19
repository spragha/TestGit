package com.raghav.corejava.java_util.mapInterface;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashTableHandling {

	public static void main(String[] args) {

		System.out.println("Hash Table Demo");

		Hashtable ht=new Hashtable();
		ht.put(1, 001);
		ht.put(2, 002);
		ht.put(3, 003);

		System.out.println(ht);

		System.out.println("Enter the key to delete the value :");
		int i=new Scanner(System.in).nextInt();
		ht.remove(i);
		ht.put(3,333); // to update the value in the hash table


		/*A Hashtable is a mapping from keys to values. It is this mapping that is shown when you print a Hashtable.
  		  The story about .hashCode and .equals is a rough description of how it manages to keep track of the
  		  key/value pairs internally.*/

		//Set s=ht.keySet();
		Set s=ht.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()){
			Map.Entry m=(Map.Entry)it.next();
			System.out.println("KEY :"+m.getKey()+" "+"VALUE :"+m.getValue());
		}

			/* *********** Hastable inside Hashtable ************* */
		Hashtable<String,String> h1=new Hashtable<String,String>();
		h1.put("p1","chennai");
		h1.put("p2","bangalore");
		h1.put("p3","kochi");

		Hashtable<String,String> h2=new Hashtable<String,String>();
		h2.put("p1","001");
		h2.put("p2","002");
		h2.put("p3","003");

		Hashtable<String,Hashtable<String,String>> h=new Hashtable<String,Hashtable<String,String>>();
		h.put("name",h1);
		h.put("Zip",h2);

		System.out.println(h.get("name").get("p2")); //getting the value from h1 from h


	}

}
