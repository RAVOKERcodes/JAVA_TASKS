package TASK;

import java.util.Scanner;

class account{

	int acn,amt,dmat;
	String name;
	char mode;
	Scanner obj = new Scanner(System.in);
	public void insert() {
		
		acn = obj.nextInt();
		name = obj.next();
		amt = obj.nextInt();
		
		mode = obj.next().charAt(0);
	}
	public void logic() {
		
if(mode=='D'||mode=='W') {
		if(mode=='D') {
			dmat=obj.nextInt();

			
		}
		else {
			if(mode=='W') {
			dmat=obj.nextInt();
				if(dmat<=amt) {
					System.out.println(amt+dmat);
				}
				else {
				System.out.println("insufficent amount");
				System.out.println("available amount is "+amt);
			}}}

	}

else {
	System.out.println("bad mode");
}}
}

public class task15 {	
	public static void main(String[]args) {
		account obj1=new account();
		obj1.insert();
		obj1.logic();
		
	}
}											
