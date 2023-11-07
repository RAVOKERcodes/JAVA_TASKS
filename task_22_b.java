package TASK;

import java.util.Scanner;

class BankAcc {
double balance;

public BankAcc(double b)
{balance=b;}
public void Authenticate()
{
	System.out.println("Enter Password");
	String pass = new Scanner(System.in).next();
	
	if(pass.equals("lord_ganesha"))
	{Interest in=new Interest(5);
	in.calculate();
	}
	else
		System.out.println("Bad...");
}
private class Interest
{double rate;

public  Interest(double i) {
	rate=i;
}
public void calculate() {
	double amt = balance*rate/100;
	balance +=amt;
	System.out.println("Interest Calculated " + balance);
}}
}
public class task_22_b{
	public static void main(String[] args) {
		BankAcc acc=new BankAcc(1000);
		acc.Authenticate();
	}
}
