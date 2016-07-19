package com.raghav.corejava.itpAssignment.file;

import java.io.*;

public class File implements Serializable
{

	String name;
	int age;
	String addr;

	public File(String name, String age, String addr) {
	this.name=name;
	this.age=Integer.parseInt(age);
	this.addr=addr;
	}



	public static void main(String[] args) throws Exception
	{

		System.out.println("Enter THE DATA :");
		BufferedReader br;

		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENter THE NAME TO WRITE IN THE FILE :");
			String name=br.readLine();
			System.out.println("ENter THE AGE TO WRITE IN THE FILE :");
			String age=br.readLine();
			System.out.println("ENter THE ADDRESS TO WRITE IN THE FILE :");
			String addr=br.readLine();

			File fc=new File( name, age, addr);

			ObjectOutputStream oos=new ObjectOutputStream (new FileOutputStream("ragha.txt"));
			oos.writeObject(fc);
			oos.close();


			ObjectInputStream ois=new ObjectInputStream (new FileInputStream("ragha.txt"));
			File fc1=(File)ois.readObject();

			fc.display(fc1);
			//fc.display();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}


	}

	private void display(File fc1) {

		System.out.println(fc1.name+" "+fc1.age+" "+fc1.addr);

	}


	public String[] list() {
		// TODO Auto-generated method stub
		return null;
	}

	/*public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	public String[] list() {
		// TODO Auto-generated method stub
		return null;
	}
*/

}
