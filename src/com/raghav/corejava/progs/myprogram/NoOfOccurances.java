package com.raghav.corejava.progs.myprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NoOfOccurances {
	String numbersStr[] = { "10", "50","50","50","40", "30", "50", "30", "20", "10",
			"20" };
	java.util.Map<String, Integer> occrancesMap = new java.util.HashMap();

	public void getOccurances() {
		for (String itrStr : numbersStr) {
			if (occrancesMap.get(itrStr) != null) {
				occrancesMap.put(itrStr, occrancesMap.get(itrStr) + 1);
			} else {
				occrancesMap.put(itrStr, 1);
			}
		}

	}

	public void printMap() {
		for (Entry<String, Integer> map : occrancesMap.entrySet()) {
			System.out.println(map.getKey() + " Occured " + map.getValue()
					+ " times");
		}
	}

	public void getUniue() {
		System.out.println("\nUnique\n");
		for (Entry<String, Integer> entry : occrancesMap.entrySet()) {
			System.out.println(entry.getKey());
		}
	}

	public void getDuplicate() {
		System.out.println("\nDuplicate\n");
		for (Entry<String, Integer> entry : occrancesMap.entrySet()) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey());
		}
	}

	public static void main(String[] args) {
		NoOfOccurances noOfOccurances = new NoOfOccurances();
		noOfOccurances.getOccurances();
		// List containing elements of map's entry set. 
		List<Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(
				noOfOccurances.occrancesMap.entrySet());
		
		 Collections.sort(entryList,new Comparator<Map.Entry<String, Integer>>() {  
			 public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {  
				 return o2.getValue()-o1.getValue();
			 }
		 });
			 
		noOfOccurances.printMap();
		noOfOccurances.getUniue();
		noOfOccurances.getDuplicate();
	}
}
