package com.raghav.corejava.progs.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatedChar {

	public static void main(String[] args) {
	getFirstNonRepeatedChar("AAAAAAAVBCB");

	}

	public static void getFirstNonRepeatedChar(String str) {
		Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
		for (char c : str.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}
		for (Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
     }
}
