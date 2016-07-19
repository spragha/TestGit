package com.raghav.corejava.itpAssignment;

class Matrix
{
	int a[][]=new int[10][10];
	int rows,cols;

	Matrix()
	{
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
				a[i][j]=0;
	}

	Matrix(int r,int c)
	{
		this();
		rows=r;
		cols=c;
	}

	void setEle(int r,int c,int val)
	{
		if(val>0)
			a[r][c]=val;
		else
			a[r][c]=0;
	}

	Matrix transpose()
	{
		Matrix m=new Matrix();
		m.rows=cols;
		m.cols=rows;
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				m.a[i][j]=a[j][i];
				return m;
	}

	void dis()
	{
		int i=0;
		while(i<rows)
		{
			for(int j=0;j<cols;j++)
				System.out.print(+a[j][i]+" ");
  				System.out.println(" ");
			i++;
		}
	}
}

public class MainMatrix
{
	public static void main(String as[])
	{
		Matrix s1=new Matrix(3,3);
		Matrix s2=new Matrix();
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
				s1.setEle(0,0,2);
				s1.setEle(0,1,5);
				s1.setEle(1,0,3);
				s1.setEle(1,1,1);
				s2=s1.transpose();
				System.out.println("The Original Matrix:");
					s1.dis();
				System.out.println("The Transpose is:");
					s2.dis();
	}
}