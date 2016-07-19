package com.raghav.corejava.Exception;

public class ExceptionDemo {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		System.err.println("Error message");

		try
		{
		//Protected code
			System.exit(0); // only by this way finally wont be executed
		}catch(Exception e1)
		{
		//Catch block
		}finally
		{
		//The finally block always executes.
		}
	}



}
