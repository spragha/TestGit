package com.raghav.corejava.progs.producerConsumer;

public class Producer implements Runnable {
	EvenOddNumberPrinter evenOddNumberPrinter;
	public Producer(EvenOddNumberPrinter evenOddNumberPrinter){
		this.evenOddNumberPrinter=evenOddNumberPrinter;
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i=i+2){
			try {
				evenOddNumberPrinter.printOdd(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
