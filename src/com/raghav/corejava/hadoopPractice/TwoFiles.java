package com.raghav.corejava.hadoopPractice;

import java.io.*;

public class TwoFiles {
	public static void main(String args[]) throws IOException {
		FileInputStream fistream1 = new FileInputStream("abc.txt");	// first source file
		FileInputStream fistream2 = new FileInputStream("MyTestFile.txt"); // second source file
		SequenceInputStream sistream = new SequenceInputStream(fistream1,fistream2);
		FileOutputStream fostream = new FileOutputStream("Result.txt"); // destination file
		System.out.println(fistream1.available());
		System.out.println(fistream1.skip(30)); // skip reading the part of file
		System.out.println(fistream1.available());
		int temp;
		while ((temp = sistream.read()) != -1) {
			System.out.print((char)temp); // to print at DOS prompt
			fostream.write(temp); // to write to file
		}
		fostream.close();
		sistream.close();
		fistream1.close();
		fistream2.close();
	}
}