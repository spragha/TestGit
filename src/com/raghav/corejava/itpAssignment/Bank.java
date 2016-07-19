/* Program to accept account information from the user and to calculate the total
   and throw an exception in case the current balance is less than 500 */
package com.raghav.corejava.itpAssignment;

import java.io.*;
class MinBalanceException extends Exception // User defined Exception
{

	public MinBalanceException()
	{
		System.out.println("Minimum balance should not be less than 500 ");
	}

}
abstract class Account
{
	int acctNo;
	double currentBalance;
	String accHolder;
	String address;
	String openingDate;
	Account() // default constructor
	{

	}
	Account(int aNo,double currBal,String accHold,String addr,String opnDt)
	{
		acctNo=aNo;
		currentBalance=currBal;
		accHolder=accHold;
		address=addr;
		openingDate=opnDt;
	}/* end of Account */

	abstract double calculateInterest(double amt); // abstract method

}

class SavingAccount extends Account
{
	double intRate;
	final int minBalance=500;

	SavingAccount(int aNo,double currBal,String accHold,String addr,String opnDt,int rate)
	{
		super(aNo,currBal,accHold,addr,opnDt);
		intRate=rate;
		try
		{

			if(currBal<minBalance)
			{
				throw new MinBalanceException();
			}

		}
		catch (MinBalanceException e)
		{
			System.out.println(e);
			System.exit(0);
		}


	}/* end of SavingAccount() */

	double calculateInterest(double amt)
	{
		return amt*0.4;
	}/* end of calculateInterest*/

}


class Bank
{
	public static void main(String s[]) throws IOException
	{
		int acctNo;
		double currentBalance;
		int rate;
		String temp;

		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));

		// read input from user

		System.out.println("Enter the Account number\n");
		temp=b.readLine();
		acctNo=Integer.parseInt(temp);

		System.out.println("Enter the Current Balance\n");
		temp=b.readLine();
		currentBalance=Double.parseDouble(temp);

		System.out.println("Enter the Account Holder\n");
		String accHolder=b.readLine();

		System.out.println("Enter the Address\n");
		String address=b.readLine();

		System.out.println("Enter the Opening Date\n");
		String openingDate=b.readLine();

		System.out.println("Enter the Rate\n");
		temp=b.readLine();
		rate=Integer.parseInt(temp);

		//create an object

		SavingAccount sa=new SavingAccount (acctNo,currentBalance,accHolder,address,openingDate,rate);

		// calculate total and display

		double total=sa.currentBalance+sa.calculateInterest(currentBalance);
		System.out.println("Total= "+total);

	}/* end of main */
}