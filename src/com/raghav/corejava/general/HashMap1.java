package com.raghav.corejava.general;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class HashMap1 {

	/**
	 * @param args
	 */
	HashMap<String,String> hMap=new HashMap<String,String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///reading data from users
		while(true)
		{
			String readInput=new Palindrome().readInput();
			new HashMap1().addHashMap(readInput);

			if(readInput.equals("1"))
			{
				new HashMap1().readHaspMap();
				System.exit(1);
			}
		}
	}


	///add data in HashMap/////
	private void addHashMap(String element)
	{
		hMap.put(element, element);

	}
	///read data from HaspMap///
	private void readHaspMap()
	{
		Set keySet= hMap.keySet();

		Iterator itMap= keySet.iterator();

		while(itMap.hasNext())
		{
			System.out.println(hMap.get(itMap.next().toString()));
			//System.out.println(itMap.next().toString());
		}

	}



}
