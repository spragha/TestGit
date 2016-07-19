package com.raghav.corejava.itpAssignment;

import java.io.IOException;

public class Bingo
{
	public static void main(String[] args)
	{
		int a[]={7,14,29,33,38},flag1=0,flag2=0,i=0,index=0;

		int tmp=Integer.parseInt(args[0]);
		int tmp1=Integer.parseInt(args[1]);

		if((tmp>1 && tmp<40) && (tmp1>1 && tmp1<40))
		{
		for(i=0;i<5;i++)
		if(a[i]==tmp)
		{
			flag1=1;
			//index=i;
			//break;
		}

		for(i=0;i<5;i++)
		if(a[i]==tmp1 /*&& i!=index*/)
		{
			flag2=1;
		}

		System.out.println("\n Your First number is:"+tmp);
		System.out.println("\n Your Second number is:"+tmp1);

		if(flag1==1 && flag2==1)
			System.out.println("BINGO");
		else
			System.out.println("Not a BINGO");

		System.out.println("The array Elements are:");
			for(i=0;i<5;i++)
				System.out.print(a[i]+"\t");
		System.out.println("\n");
		}
		else
		{
			System.out.println("Error: Out of range values");
			System.exit(0);
		}

	}
}