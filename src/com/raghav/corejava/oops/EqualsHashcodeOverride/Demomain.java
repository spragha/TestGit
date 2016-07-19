package com.raghav.corejava.oops.EqualsHashcodeOverride;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demomain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add(new Customer("RAJ",45,"Delhi"));
		l.add(new Customer("RAJ",5,"Chennai"));
		l.add(new Customer("RAJ",69,"Bangalore"));
		//Collections.sort(l);
		Collections.sort(l, new DemoComp());
		System.out.println(l.toString());
	}

	  public static class DemoComp implements Comparator<Customer>{

		@Override
		public int compare(Customer o1, Customer o2) {
			// TODO Auto-generated method stub
		 return o1.getCity().compareTo(o2.getCity());
		}
	  }
}
