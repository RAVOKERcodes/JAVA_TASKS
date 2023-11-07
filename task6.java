package TASK;

import java.util.Scanner;

public class task6 {
	static int frequency(int n, int d)
	{
		int c=0;
		while(n>0) {
			//check equality
			if(n%10==d)
				c++;
			//reduce number
			n=n/10;	
		}
		return c;
	}
//main(driver code)
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number: ");
		int n = scanner.nextInt();
		System.out.println("enter number u wanna know how many times it repeated: ");
		int d = scanner.nextInt();
		System.out.println(d+" repeated "+frequency(n,d)+" times");
		scanner.close(); 
	}
}