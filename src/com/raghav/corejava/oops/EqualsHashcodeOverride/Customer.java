package com.raghav.corejava.oops.EqualsHashcodeOverride;

public class Customer implements Comparable<Customer> {
	
	String name;
	int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setName(String name) {
		this.name = name;
	}
	String city;
	Customer(String name,int age,String city){
		this.name=name;
		this.age=age;
		this.city=city;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", city=" + city+"]";
				
	}
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Customer o) {
		
		return this.city.compareTo(o.getCity());
	}

	
}
