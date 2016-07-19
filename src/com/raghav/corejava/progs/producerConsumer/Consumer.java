package com.raghav.corejava.progs.producerConsumer;

public class Consumer implements Runnable {
	EvenOddNumberPrinter evenOddNumberPrinter;
	public Consumer(EvenOddNumberPrinter evenOddNumberPrinter){
		this.evenOddNumberPrinter=evenOddNumberPrinter;
	}
	
	@Override
	public void run() {
		for(int i=2;i<=10;i=i+2){
			try {
				evenOddNumberPrinter.printEven(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
