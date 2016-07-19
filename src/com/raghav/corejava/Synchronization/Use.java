package com.raghav.corejava.Synchronization;

class Table{

	synchronized public void printTable(int n){//synchronized method
		synchronized(this){ // synchronized block used for sync small part of a method
	   for(int i=1;i<=5;i++){
	     System.out.println(n*i);
	     try{
	      Thread.sleep(400);
	     }catch(Exception e){System.out.println(e);}
	   }
		}
	 }
	}

class Use extends Thread{
	public static void main(String args[]){
	final Table obj = new Table();//only one object

	Use t1=new Use(){
	public void run(){
	obj.printTable(5);
	}
	};
	Use t2=new Use(){
	public void run(){
	obj.printTable(100);
	}
	};

	t1.start();
	t2.start();
	}
	}