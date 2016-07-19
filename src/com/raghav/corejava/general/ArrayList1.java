package com.raghav.corejava.general;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
/**
*
@param args
*/
public static void main(String[] args) {
// TODO Auto-generated method st
	ArrayList<String> ar=new ArrayList<String>();
	BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Your Text:---------- and enter to store in arrayList");
	System.out.println("Type 'exit' and enter for display ArrayList");
	while(true)
	{
			try
			{
				String str=buff.readLine();
				if(!str.equals("exit"))
					ar.add(str);
				if(str.equals("exit"))
				{
					Iterator<String> it= ar.iterator();
					while(it.hasNext())
					{
						System.out.println(it.next().toString());
					}
					System.exit(1);
				}
			}
			catch(Exception exp)
			{System.out.println(exp.getMessage());}
	}
	}
}
