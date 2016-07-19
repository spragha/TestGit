package com.raghav.corejava.oops;

class Parent{

	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;

	public void display(){
		System.out.println(this.id+" "+this.name);
	}
}


public class DiffWaysToCreateObjects  {

	public static void main(String[] args) throws
	InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {

	/*//1st
	DiffWaysToCreateObjects normal=new DiffWaysToCreateObjects();
	//2nd
	new DiffWaysToCreateObjects();
	//3rd
	DiffWaysToCreateObjects xxx=(DiffWaysToCreateObjects)Class.forName("DiffWaysToCreateObjects").newInstance();
	//4th
	DiffWaysToCreateObjects yyy=(DiffWaysToCreateObjects) xxx.clone();
	//5th
	ObjectInputStreamName inStream = new ObjectInputStreamName(anInputStream );
	MyObjectName object = (MyObjectNmae) inStream.readObject();
	//6th
	ClassName ObgRef=ClassName.FactoryMethod();
	RunTime rt=Runtime.getRunTime();//Static Factory Method
	*/
	
		
	Parent p=new Parent();
	Parent q=new Parent();
	p.setId(111);
	p.setName("RAGHAVAN");

	q.id=p.id;
	q.name=p.name.concat("q's data");

	p.display();
	System.out.println("Printed p's data");
	q.display();
	System.out.println("Printed q's data");

	}

}
