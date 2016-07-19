package com.raghav.corejava.java_util.collectionInterface.setInterface;

import java.util.*;
import java.util.Map.Entry;

public class CollectionsTest {
  public static void main(String[] args) {
    List l = new ArrayList();
    Map m = new TreeMap();
    Set s = new TreeSet();

    l.add(new Integer(1));
    l.add(new Integer(4));
    l.add(new Integer(3));

    m.put(new Integer(1), "A");
    m.put(new Integer(4), "B");
    m.put(new Integer(3), "C");

    s.add(new Integer(1));
    s.add(new Integer(4));
    s.add(new Integer(3));

     //Map does not have duplicate Keys. If a Map has 4 keys......KeySet will have 4 keys
    //and entrySet will also have 4 objects of key-value pair..


     // Four ways of iterating over Map collection
    HashMap<String, String> loans = new HashMap<String, String>();
    loans.put("home loan", "citibank");
    loans.put("personal loan", "Wells Fargo");

    //Iterator.remove, Set.remove, removeAll, retainAll, and clear operations.
    //for each & keyset
    for (String key : loans.keySet()) {
       System.out.println("------------------------------------------------");
       System.out.println("Iterating or looping map using java5 foreach loop");
       System.out.println("key: " + key + " value: " + loans.get(key));
    }
    //Set<Map.Entry<String, String>> entry =loans.entrySet();
    //for each & keyset
    //Set<Map.Entry<String, String>> entrySet = loans.entrySet();
    for (Map.Entry<String, String> entry : loans.entrySet()) {
    	   System.out.println("------------------------------------------------");
    	   System.out.println("looping HashMap in Java using EntrySet and java5 for loop");
    	   System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
    	}

    Set<String> keySet = loans.keySet();
    Iterator<String> keySetIterator = keySet.iterator();
    while (keySetIterator.hasNext()) {
       System.out.println("------------------------------------------------");
       System.out.println("Iterating Map in Java using KeySet Iterator");
       String key = keySetIterator.next();
       System.out.println("key: " + key + " value: " + loans.get(key));
    }

    //Set<Map.Entry<String, String>> entrySet = loans.entrySet();
    Iterator<Entry<String, String>> entrySetIterator = loans.entrySet().iterator();
    while (entrySetIterator.hasNext()) {
       System.out.println("------------------------------------------------");
       System.out.println("Iterating HashMap in Java using EntrySet and Java iterator");
       Entry entry = entrySetIterator.next();
       System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
    }


  }
}