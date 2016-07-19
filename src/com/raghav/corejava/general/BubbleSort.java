package com.raghav.corejava.general;
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub




		int a[]={45,32,67,34,33,9,98,76};
		int num=0,temp=0;
		num=a.length;
		System.out.println("Number of Elements = "+num);
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num-1;j++)
		{
			if(a[j]>a[j+1])
			{
			temp=a[j+1];
			a[j+1]=a[j];
			a[j]=temp;
			}
		}
		}

		for(int i=0;i<num;i++)
			System.out.print( " "+ a[i]+ " ");

	}

}
