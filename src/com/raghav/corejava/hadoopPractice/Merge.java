package com.raghav.corejava.hadoopPractice;

import java.io.*;

public class Merge {
	public static void main(String args[]) throws IOException {
		BufferedReader br1 = new BufferedReader(new FileReader("Source1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("Source2.txt"));

		StringBuffer sb = new StringBuffer();
		while (true) {
			try {
				String str1 = br1.readLine();
				if (str1 != null) {
					sb.append(str1);
					sb.append("|");
					sb.append(br2.readLine());
					sb.append("||\n"); // after 15 spaces || comes
				} else {
					break;
				}
			} catch (EOFException e) {
				br1.close();
				br2.close();
				break;
			}
		}
		System.out.println(sb);
	}
}