package com.raghav.corejava.itpAssignment.file;

import java.io.*;
public class filereader
{
	public static void main(String[] args)
	{
		try
	       {
		     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		     BufferedWriter br1 = new BufferedWriter(new FileWriter("abc.txt"));
		     BufferedInputStream bis=new BufferedInputStream(new FileInputStream("abc.txt"));

		     BufferedReader br2=new BufferedReader(new FileReader("abc.txt"));

		     System.out.println("ENTER THE TEXT TO THE FILE");
		     String s;
		     do
		     {
		      s=br.readLine();
		      br1.write(s);
		    //br1.newLine();
		     }while(!s.equalsIgnoreCase("stop"));
		     br1.close();

			int inp;

		      while((inp=bis.read())!=-1)
		      {
		    	 System.out.print((char)inp);
		      }

		      String s1;
		      while(!br2.readLine().trim().equalsIgnoreCase("stop")){
		    	  System.out.println();
		      }
	       }
	catch(Exception e)
	{

	}
  }
}
