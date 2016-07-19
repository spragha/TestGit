package com.raghav.corejava.progs.producerConsumer;

public class EvenOddNumberPrinter {
	private boolean eventPrinted=true;
	public  void printEven(int n) throws InterruptedException{
		synchronized(this){
			if(eventPrinted) 
				this.wait();
			System.out.println("even number="+n);
			eventPrinted=true;
			this.notify();
		}
	}
public  void printOdd(int n) throws InterruptedException{
	synchronized(this){
		if(!eventPrinted) 
			this.wait();
		System.out.println("odd number="+n);
		eventPrinted=false;
		this.notify();
	}
	}

}
