package com;

public class Employee {
	private String firstname;
	private String lastname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public static class Builder {
		private String firstname;

		private String lastname;

		public Builder(String firstname, String lastname) {
			this.firstname = firstname;
			this.lastname = lastname;
		}

		public Employee build() {
			return new Employee(this);
		}
	}

	public Employee(Builder builder) {
		firstname = builder.firstname;
		lastname = builder.lastname;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstname+" "+lastname;
	}

	public static void main(String[] args) {
		Employee emp = new Employee.Builder("Joe", "Irudayaraj").build();
		System.out.println(emp);
	}
}
