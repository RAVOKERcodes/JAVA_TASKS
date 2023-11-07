package TASK;

import java.util.Scanner;

public class task_number_pattren {

	public static void main(String[] args) {
		int num,a=0,b=0,p=0;
		Scanner obj = new Scanner(System.in);
		System.out.print("This Program will Print An Next level Pattern\n\n");
		System.out.println("Enter Your number : ");
		num = obj.nextInt();
		System.out.println("Number you have Entered : "+num);
		for (int i=0; i<num; i++)   
		{
			for (p=0; p<=i; p++ )   
			{    
					//prints star      
				System.out.print(" ");   
			} 
			for(int j=1;j<=i;j++)
			{System.out.print("");
			     p+=1;
				System.out.print(""+p+"*");
				a+=1;
			}
			for(int k=1;k<=i;k++)
			{ b++;
				System.out.printf("%d*",b+i*i);
				
			}

			System.out.println();
		}
		
		
	}

}
