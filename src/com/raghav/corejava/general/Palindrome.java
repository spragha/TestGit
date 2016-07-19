package com.raghav.corejava.general;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				// TODO Auto-generated method stub
				String inputString=new Palindrome().readInput();
				new Palindrome().checkPalindrom(inputString);
		}///end of main

	protected String readInput()//read from console
	{
		System.out.println("Enter your String :--------");
		String capturedValue=null;
		try
		{
			BufferedReader readLine=new BufferedReader(new InputStreamReader(System.in));
			capturedValue=readLine.readLine();
		}
		catch(Exception exp)
		{
			capturedValue="Exception";
			System.out.println("Exception while Reading Data from User");

		}

		return capturedValue;

	}

	private Boolean checkPalindrom(String inputString)///return true for palindrom
	{
		String reverseString=new String();
		Boolean flag=false;
		try{

			//int inputStringLength = inputString.length();
			 //System.out.println("Length =" +inputStringLength);
		      for (int i=inputString.length()-1;i>=0;i--)
		    	  	reverseString = reverseString + inputString.charAt(i);
		      		System.out.println(reverseString);
		      if (inputString.equalsIgnoreCase(reverseString))
		      {
		    	  	System.out.println("Entered string is a palindrome.");
		    	  	flag=true;
		      }
		      else
		         System.out.println("Entered string is not a palindrome.");

		   }
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return flag;

	}


	}
