package com.raghav.corejava.InnerClasss;

public class Raghavan {

	/**
	 * @param args
	 */
	private int raghavan=10;
	public int getRaghavan(){
		 return raghavan;
	}
	/// Dhanu class
	public static class Dhanu {

		private int dhanu=20;
		 static{
		 System.out.println("static Dhanu is called");
		 }

		 public int getDhanu(){
			 return dhanu;
		 }

		 /// Ramu class
		 public static class Ramu {

			 private int ramu=30;

		 	static{
				 System.out.println("staticRamu is called");
		 	}

		 	public int getRamu(){
				 return ramu;
			}
		 }

	 }

}
