package com.raghav.corejava.java_util.collectionInterface.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ArrayDemo {
	int stuID;

	String stuName;

	char stugender;

	public ArrayDemo() {

	}

	ArrayDemo(int id, String name, char gender) {
		this.stuID = id;
		this.stuName = name;
		this.stugender = gender;

	}

	public void arrayListInArrayList() {

		System.out.println("ArrayList inside ArrayList");
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(111);
		lst.add(222);
		lst.add(333);

		List<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(555);
		lst1.add(666);
		lst1.add(777);

		lst.addAll(lst1); //storing arraylist object inside arraylist -- options(removeAll,retainAll-->retains only matching attributes)
		//lst.retainAll(lst1);
		//lst.removeAll(lst1);

		System.out.println(lst);
	}

}

public class ArrayListHandling {

	public static void main(String[] args) {

		ArrayDemo ad1 = new ArrayDemo(909, "SOHAM", 'M');
		ArrayDemo ad2 = new ArrayDemo(901, "SANDY", 'M');
		ArrayDemo ad3 = new ArrayDemo(902, "RAGHA", 'M');

		ArrayList al = new ArrayList();
		al.add(ad1);
		al.add(ad2);
		al.add(ad3);
		System.out.println(al);

		Iterator it = al.iterator();
		while (it.hasNext()) {
			ArrayDemo ad = (ArrayDemo) it.next();
			System.out
					.println(ad.stuID + " " + ad.stuName + " " + ad.stugender);
		}

		new ArrayDemo().arrayListInArrayList(); //calling the method via class default constructor

		System.exit(0); //if you need to run the below program comment this line

		System.out.println("ArrayList");

		ArrayList<String> ar = new ArrayList<String>();

		ar.add("chennai");
		ar.add("Bangalore");
		ar.add("Hyderabad");
		ar.add("Pune");
		System.out.println(ar);

		String ss = ar.get(0); //to get the value from the collection via index
		System.out.println(ss);
		ar.remove(1); // to remove the value form the collection
		System.out.println("deleated object=>");
		ar.set(2, "Kochi"); //to update the collection
		System.out.println("Updated Kochi at 2");

		// Using Iterator
		Iterator itr = ar.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		//for each loop
		for (String ragha : ar)
			System.out.println(ragha);

	}

}
