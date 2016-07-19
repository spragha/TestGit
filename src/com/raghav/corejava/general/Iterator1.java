package com.raghav.corejava.general;
import java.io.*;

public class Iterator1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={'1','2','3','5','6','7'};
		int count;
		int num=0;
		String num1;
		System.out.println("Enter the number");
		 try {
		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		        num1 = bufferedReader.readLine();
		        num = Integer.parseInt(num1);
		    } catch (NumberFormatException ex) {
		       System.out.println("Not a number !");
		    } catch (Exception e) {
		        e.printStackTrace();
		    }

		    count=a.length;
		    System.out.println("Count = " + count);
		    for(int i=0;i<count-1;i++)
		    {
		    	if(num==a[i+1])
		    	{
		    		System.out.println("Iterator Value Matched");
		    	}
		    }
		    		System.out.println("Iterator Value not Matched");

	}

}
