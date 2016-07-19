package com.raghav.corejava.progs.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FrequencyOFWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "sachine dhoni sachine dhoni sachine sachine dhoni kholi";
		String charString = "NNNNNNAAAAAVBBBVF";
		int[] n = { 3, 2, 3, 4, 5, 2, 1, 2, 3, 4 };
		findduplicateString(str);
		findduplicateCharacter(charString);
		findduplicateNumber(n);
	}

	static void findduplicateNumber(int[] n) {
		System.out.println("********************");
		List<Integer> intList = new ArrayList<>();
		for (int i : n) {
			Integer in = new Integer(i);
			intList.add(in);
		}
		//Set<Integer> set = new HashSet<>(intList);
		Set<Integer> set=new TreeSet<Integer>(intList);

		for (Integer s : set) {

			int ni = Collections.frequency(intList, s);
			if (ni > 1) {
				System.out.println(s + "=" + ni);
			}
		}
		System.out.println("********************");

	}

	static void findduplicateCharacter(String str) {
		System.out.println("********************");
		char[]charArray=str.toCharArray();
		List<Character> list = new ArrayList<>();
		for (char i : charArray) {
			Character in = new Character(i);
			list.add(in);
		}
		Set<Character> set = new HashSet<>(list);
		Collections.sort(list);

		for (Character s : set) {

			int ni = Collections.frequency(list, s);
			if (ni > 1) {
				System.out.println(s + "=" + ni);
			}
		}
		System.out.println("********************");
	}

	static void findduplicateString(String str) {
		System.out.println("********************");
		String[] strArray = str.split(" ");
		List<String> list = Arrays.asList(strArray);
		Set<String> set = new HashSet<>(list);

		for (String s : set) {

			int n = Collections.frequency(list, s);
			if (n > 1) {
				System.out.println(s + "=" + n);
			}
			
		}
		System.out.println("********************");
	}

}
