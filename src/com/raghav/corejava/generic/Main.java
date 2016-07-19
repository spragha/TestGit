package com.raghav.corejava.generic;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GenericValue<Nominal> genericValue=new GenericValue<Nominal>();
		genericValue.setdAmount(100.00);
		genericValue.setdCurrency(200.00);
		System.out.println(genericValue.getdAmount());
		System.out.println(genericValue.getdCurrency());

		GenericValue<Maximum> genericValue1=new GenericValue<Maximum>();
		genericValue.setdAmount(300.00);
		genericValue.setdCurrency(400.00);
		System.out.println(genericValue1.getdAmount());
		System.out.println(genericValue1.getdCurrency());

	}

}
