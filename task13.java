package TASK;

import java.util.Scanner;

public class task13 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);

	int term=sc.nextInt();

	// Pattern 1


	for(int i=1;i<term;i++){ for(int j=1;j<=i;j++){

	System.out.print("*");

	}

	System.out.println(); //new line

	//Pattern 2

	for(int i1=1;i1<=term;i1++)
	{	for(int k=term;k>=i1; i1--)
	{
			System.out.print("*");
	}
	System.out.println();//new line

	}
	}
	}}

