package com.raghav.corejava.progs.producerConsumer;

public class MainClass {

	public static void main(String[] args) {
		
		EvenOddNumberPrinter evenOddNumberPrinter=new EvenOddNumberPrinter();
		new Thread(new Producer(evenOddNumberPrinter)).start();
		new Thread(new Consumer(evenOddNumberPrinter)).start();
	}

}
