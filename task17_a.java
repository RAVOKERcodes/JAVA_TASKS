package TASK;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class one{
	two obj;
	
	public one (two ob) {
		obj=ob;
	}
	public double Cube(double x) {
		return x* obj.square(x);
	}
}
class two{
	three t;
	public two (three ob) {
		t=ob;
	}
	public double square(double x) {
		// TODO Auto-generated method stub
		return x *t.get(x);
	}
	
}
class three{

	public double get(double x) {
		// TODO Auto-generated method stub
		return x;
	}
	
}


public class task17_a {
	public static void main(String args[]) {
//object graph/chaining
//buffered reader
//runtime polymorphism
//inharitance
//logical implementation/separation
		
	one x=new one(new two(new three()));   //obj chain
	System.out.println(x.Cube(3));
	
//-------------------------built in---------------------//
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	try {
		String name=br.readLine();
		System.out.println(name);
		}
	catch(IOException e) {
		e.printStackTrace();
	}
	System.out.println("rest of code");
	}   
}
