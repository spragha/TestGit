package com.raghav.corejava.progs.array;

import com.sun.java_cup.internal.runtime.Scanner;

public class MyFibonacci {
	 
    public static void main(String a[]){
         
         int index=new java.util.Scanner(System.in).nextInt();
         int[] feb = new int[index];
         feb[0] = 0;
         feb[1] = 1;
         for(int i=2; i < index; i++){
             feb[i] = feb[i-1] + feb[i-2];
         }
 
         for(int i=0; i< feb.length; i++){
                 System.out.print(feb[i] + " ");
         }
         
         System.out.println("---------------------------------");
         new MyFibonacci().printFibonacci(index);
         
        /* for(int i:feb)
        	 System.out.print(i+" ");*/
    }
    
    int n1=0,n2=1,n3;
     
     //recursive way	
	 void printFibonacci(int index){    
	    if(index>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(index-1);    
	     }    
	 }

}
