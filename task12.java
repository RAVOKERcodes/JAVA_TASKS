package TASK;

import java.util.Scanner;

public class task12 {	
	public static void main(String[]args) {
		int r,c;
		
		Scanner sc=new Scanner (System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		int matrix[][]= new int[r][c];
		
		for (int i=0;i<matrix.length;i++)	//nested loop
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				matrix[i][j]=sc.nextInt();
				matrix[i][j]++;
			}
		}		
				
				
				
				
				 
				//d&i     source can be arr,aob,class
		
		
		for (int i=0;i<matrix.length;i++)	//nested loop
		{
			for(int j=0;j<matrix[i].length;j++)
				
		{
			System.out.print(matrix[i][j]+" ");
		}
			System.out.println();//new line
		}
		
		
	}
}	