package TASK;

import java.util.Scanner;

public class task_pattren_trapzium {
	public static void main(String args[])   
	{    
							//i for rows and j for columns      
							//row denotes the number of rows you want to print  
		int i, j;       
			Scanner sc=new Scanner(System.in);

			int row=sc.nextInt();
							//Outer loop work for rows  
			for (i=0; i<row; i++)   
			{  
				for (j=0; j<=i; j++ )   
				{    
						//prints star      
					System.out.print(" ");   
				} 
				for (j=row-i; j>1; j--)   
				{  
						//prints space between two stars     
					System.out.print(j);   
				}   
				
			System.out.println();
				
				
			}
}
}