package com.raghav.corejava.java_lang;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="raghavan";
		String str1="raghavan";
		String str2=new String("raghavan");
		String str3="soham";

		if(str==str2){
			System.out.println("same - == method");
			System.out.println("str hashcode "+str.hashCode()+" ---str2 hashcode "+str1.hashCode());
		}
		else{
			System.out.println("different - == method");
			System.out.println("str hashcode "+str.hashCode()+" ---str2 hashcode "+str1.hashCode());
		}

		if(str.equals(str2)){
			System.out.println("same - equals method");
			System.out.println("str hashcode "+str.hashCode()+" ---str2 hashcode"+str1.hashCode());
		}
		else{
			System.out.println("different - equals method");
			System.out.println("str hashcode "+str.hashCode()+" ---str2 hashcode "+str1.hashCode());
		}

		Object obj=new Object();
		Object obj1=new Object();

		boolean comp=obj.equals(obj1);
		System.out.println("Null comparision  "+comp+"--- "+obj.getClass()+" obj hashcode "+obj.hashCode()+" obj hashcode "+obj1.hashCode());


		/*System.out.println(str.equals(str1));

		str.concat("is a good boy"); // this object is lost without any reference
		str=str.concat("is a good boy");
		System.out.println(str);

		String str2="Welcome to the official global channel of Samsung Mobile, where you can find the latest videos about our company and products.";

		System.out.println(str2.equals(str1));*/
		/*System.out.println("lenght of str :"+str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("v"));
		System.out.println(str.compareTo(str1));
		System.out.println(str.lastIndexOf("a"));
		*/

	/*	String s[];
		s=str.split(" ");

		for(int i=0;i<s.length;i++){

			System.out.println(s[i].toUpperCase());
			//System.out.println(s[i].concat(" "));
		}
		*/


	}

}
