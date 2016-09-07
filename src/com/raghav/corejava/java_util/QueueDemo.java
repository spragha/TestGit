package com.raghav.corejava.java_util;

import java.util.LinkedList;
import java.util.List;

public class QueueDemo {

	public static void main(String[] args) {
		List<String> queueList1=new LinkedList<>();
		List<String> queueList2=new LinkedList<>();
		
		queueList1.add("q11");
		((LinkedList)queueList1).offer("q12");
		queueList1.add("q13");
		queueList1.add("q14");
		
		
		queueList2.add("q21");
		queueList2.add("q22");
		queueList2.add("q23");
		queueList2.add("q24");
		
		((LinkedList)queueList1).addFirst(queueList2);
		
		System.out.println(queueList1);
		System.out.println(queueList2);
		
		System.out.println(((LinkedList)queueList1).peek());
		System.out.println(((LinkedList)queueList1).poll());
		
		System.out.println("==============================");
		System.out.println(queueList1);
		System.out.println(queueList2);

	}

}
