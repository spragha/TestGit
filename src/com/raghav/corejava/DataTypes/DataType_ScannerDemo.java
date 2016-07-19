package com.raghav.corejava.DataTypes;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

class ObjectCasting  {

	public void printMethod(String strr) {
		System.out.println(strr);
		System.out.println("Super class");
	}
}

class DataType_ScannerDemo extends ObjectCasting {

	public void printMethod(String strr) {
		System.out.println(strr);
		System.out.println("Sub class");
	}


	public static void main(String[] args) throws ParseException {

		//Naming convention in JAVA
		/*
		 package com.mycompany.utilities
		 class Customer
		 interface Comparable
		 interface IComparable
		 Note that some programmers like to distinguish interfaces by beginning the name with an "I":

		 void calculateTax()
		 string getSurname()

		 string firstName
		 int orderNumber

		 static final int MAX_HEIGHT */



	// Primitive Data types
		byte b = 1; // SIZE 1 byte Defaulut=o min=-128 max=127
		short s = 10; // SIZE 2 byte Defaulut=o min=-32,768  max=32,767
		int i = 100; // SIZE 4 byte Defaulut=o min=- 2,147,483,648 max=2,147,483,647
		long l = 1000L; // SIZE 6 byte Defaulut=oL min=-9,223,372,036,854,775,808 max=9,223,372,036,854,775,807
		float f = 100.00f; // SIZE 4 byte Defaulut=o.0f min=-128 max=127
		double d = 100.000d; // SIZE 6 byte Defaulut=o.0d min=-128 max=127
		char c = 'c'; // SIZE 2 byte Defaulut=o min='\u0000'  max='\uffff'
		boolean B = true; // SIZE 1 bit Defaulut=false TRUE/FALSE

		String strr = "raghavan";

	// NoN Primitive Data types
		DataType_ScannerDemo DS; 	//referential datatype or object or  Non primitive data type. NULL is the default value
		ObjectCasting OC;


	//	CONVERSION FROM one Datatype to Datatype

			//	byte –> short –> int –> long –> float –> double
			//	In the above statement, left to right can be assigned implicitly and right to left requires explicit casting.

	// Data Type Casting (Type Conversion)

	    //Implicit casting
			l=i;
		System.out.println("Int converted into long Implicitly"+l);

	    //Explicit casting
			i=(int)l;
			System.out.println("Long converted into Int Explicitly"+i);

	    //Boolean casting is not possible max we can assign boolean value to another Boolean


	// Object Casting

		OC=new ObjectCasting();
		DS = new DataType_ScannerDemo();


		OC=DS;  //upcasting  superclass ref to subclass class object
		DS=(DataType_ScannerDemo)OC; //downcasting  super ref to sub class object



	//Taking data types input via Scanner class
		Scanner sc=new Scanner(System.in);

		System.out.println("STRING : ");
		String str = new Scanner(System.in).next();

		System.out.println("INTEGER : ");
		int in = new Scanner(System.in).nextInt();

		System.out.println("FLOAT : ");
		Float fl = new Scanner(System.in).nextFloat();


	// String to Number conversion
		int i1=Integer.parseInt(str);
		float f1=Float.parseFloat(str);
		double d1=Double.parseDouble(str);

	// Number to String conversion
		String Demo=String.valueOf(i1);
		
		Integer integer=i1;
		integer.toString();
		
		Integer i2 = (int) Math.floor(f1); //use math ooperator to round,ceil,floor the value to pass into double

	//	String to Date
		String Reportdate="January 2, 2010";

		DateFormat df=new SimpleDateFormat("MMMM d, yyyy");
		Date dt=df.parse(Reportdate);
		/** Directly converting to date without any dateformat reference */
		Date date=new SimpleDateFormat("MMMM d, yyyy",Locale.ENGLISH).parse(Reportdate);

		System.out.println(dt);
		System.out.println(date);

	// Date to String
		//String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
		//Calendar cal = Calendar.getInstance();
		//SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");
		//String Today=sdf.format(dt);

		String Today=df.format(dt);
		System.out.println(Today);

	}

}
