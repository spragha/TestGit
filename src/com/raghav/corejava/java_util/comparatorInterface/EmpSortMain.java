package com.raghav.corejava.java_util.comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Person implements Comparable {
  String firstName, lastName;
  int id;

  public Person(String f, String l,int id) {
    this.firstName = f;
    this.lastName = l;
    this.id=id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String toString() {
    return "[ id=" + id + ",firstName=" + firstName + ",lastName="+lastName+"]";
  }

  public int compareTo(Object obj) {
    Person emp = (Person) obj;
    //return id-emp.getId();
    int idComp=id-emp.getId();
    int firstNameComp = ((idComp == 0) ? firstName.compareTo(emp.getFirstName()) : idComp);
   
    return ((firstNameComp == 0) ? lastName.compareTo(emp.getLastName()) : firstNameComp);
  }
  
  int boolToInt(boolean b) {
	    return Boolean.compare(b, false);
	}

  public boolean equals(Object obj) {
    if (!(obj instanceof Person)) {
      return false;
    }
    Person emp = (Person) obj;
    return firstName.equals(emp.getFirstName()) && lastName.equals(emp.getLastName()) && id==emp.id;
  }
}

/*class PersonComparator implements Comparator<Person> {
  public int compare(Person emp1, Person emp2) {
    int nameComp = emp1.getLastName().compareTo(emp2.getLastName());
    return ((nameComp == 0) ? emp1.getFirstName().compareTo(emp2.getFirstName()) : nameComp);
  }
}
*/
public class EmpSortMain {
  public static void main(String args[]) {
    ArrayList<Person> names = new ArrayList<Person>();
    names.add(new Person("E", "T",1));
    names.add(new Person("A", "G",3));
    names.add(new Person("B", "H",5));
    names.add(new Person("C", "J",2));
    names.add(new Person("A", "J",1));
    names.add(new Person("A", "J",3));

    Iterator iter1 = names.iterator();
    while (iter1.hasNext()) {
      System.out.println(iter1.next());
    }
//    Collections.sort(names, new PersonComparator());
    
    Collections.sort(names);
    
  System.out.println("**********After Sorting**********");
    Iterator iter2 = names.iterator();
    while (iter2.hasNext()) {      
      System.out.println(iter2.next());
    }
  }
}

