package com.raghav.corejava.progs.math;

public class PowerOf2 {

	public static void main(String[] args) {
		System.out.println(bitwisePow(16));
		System.out.println(bitCountPow(16));
		System.out.println(bruteForcePow(16));

	}
  static boolean bitwisePow(int n){
	  return (n & (n-1))==0;
  }
  static boolean bitCountPow(int n){
	  return Integer.bitCount(n)==1;
  }
  static boolean bruteForcePow(int n){
	  if(n==0) return false;
	  if(n==1) return true;
	  n=Math.abs(n);
	  while(n>2){
		  if(n%2!=0){
			  break;
		  }
		  n=n/2;
	  }
	  
	  return !(n>2);
  }
  
}
