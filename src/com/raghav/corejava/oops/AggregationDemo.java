package com.raghav.corejava.oops;

class Address {
	String place;
	String state;
	String country;

	public Address(String place, String state, String country) {
		this.place=place;
		this.state=state;
		this.country=country;
	}
}

public class AggregationDemo {

	int id;
	String name;
	Address address;  //entity reference Aggregation HAS-A address

	public AggregationDemo(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display(){
		System.out.print(id+" "+name+" ");
		System.out.println(address.place+" "+address.state+" "+address.country);

	}

	public static void main(String[] args) {

		Address ad = new Address("Madhavaram", "Tamilnadu", "India");
		AggregationDemo ag = new AggregationDemo(111,"RAGHAVAN",ad);

		ag.display();

	}

}
