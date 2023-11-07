package TASK;

class OuterClass{
	static int outer_x = 10;
	
	int outer_y = 20;
	//private member
	private static int outer_private = 30;
	
	public void showOuter()
	{
		System.out.println(outer_x);
		System.out.println(outer_y);
		System.out.println(outer_private);
	}
	// STATIC CLASS ONLY ACCESS STATIC METHODS
	/*static class StaticNestedClass
	{
		void display()
		{	//can access static member of outer class
			System.out.println("outer_x= "+outer_x);
			// can access display private static member of outer class
			System.out.println("outer_private= "+outer_private);
			
			// the following statement will give compilation error 
			//as static nested class cannot directly access non-static members
			//System.out.println("outer_y= "+outer_y);
			
			new OuterClass().showOuter();
		}
	}*/
	class InnerClass
	{
		void display()
		{
			System.out.println("outer_x= "+outer_x);
			System.out.println("outer_y= "+outer_y);
			System.out.println("outer_private= "+outer_private);
		}
	}
}
// Driver class
public class task_22_a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub  	// accessing a static nested class
		// THIS IS BASICALLY USED FOR CREATING OBJECT OF OUTER CLASS 
		//OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
		//nestedObject.display();

		// THIS BELOW CODE IS USED TO MAKE AN OBJECT OF AN NON STATIC CLASSS
		OuterClass outerObject = new OuterClass();
		OuterClass.InnerClass innerObject = outerObject.new InnerClass();
		innerObject.display();
	}
}