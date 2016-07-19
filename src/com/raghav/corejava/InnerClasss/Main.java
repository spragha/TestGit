package com.raghav.corejava.InnerClasss;

import com.raghav.corejava.InnerClasss.Raghavan.Dhanu;
import com.raghav.corejava.InnerClasss.Raghavan.Dhanu.Ramu;

public class Main {

	public static void main(String[] args) {

		Raghavan raghavan=new Raghavan();
		System.out.println(raghavan.getRaghavan());

		Dhanu dhanu=new Dhanu();
		System.out.println(dhanu.getDhanu());

		Ramu ramu=new Ramu();
		System.out.println(ramu.getRamu());

		/*String str="22 222";
		int i=Integer.parseInt(str);*/


	}

}
