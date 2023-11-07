package TASK;

import java.util.Scanner;
//===//calculator with error handling and custom error log//===//
class calculation {

//--------------------------------------------- DMs
	int a, b;
	char op;
//--------------------------------------------- MFs
	Scanner sc=new Scanner(System.in);

	public void input_user() 
{	
	System.out.println("Enter both numbers ");

//---------try and catch thing study about it because its cool(know more)
    try  
  {  
//-------------------------------------------- user input numbers
    	a=sc.nextInt();
    	b=sc.nextInt();//may throw exception 
//-------------------------------------------- user input operator
    	System.out.println("Enter arthmatic operator ");
    	op=sc.next().charAt(0);
//-------------------------------------------- if else logics 	
    	if(op=='+')
		{
			System.out.println(a+b);
		}
		else if(op=='-')
		{
			System.out.println(a-b);
		}
		else if(op=='/')
		{
			System.out.println(a/b);
		}
		else if(op=='*')
		{
			System.out.println(a*b);
		}
		else if(op=='%')
		{
			System.out.println(a%b);
		}
		else
		{
			System.out.println("-1");
		}
    }  
//-------------------------------------------- handling the exception  
    catch(Exception e)  
    {  
//-------------------------------------------- displaying the custom message for any error 
        System.out.println("BAD");  
    } 
  }
}

public class task_1_calculator 
{
	public static void main(String[]args) 
	{
//------------------------------------------- object creation and calling
		calculation obj=new calculation();
		obj.input_user();
		obj=null;
//===//Congratulation DHRUV you took 2hr to do this you are officially dumb (-_-) //===//
	}		
}