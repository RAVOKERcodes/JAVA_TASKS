package TASK;

import java.util.Scanner;

class Call{

	private int callid;
	private long calledNumber;
	private float duration; 
	
	public void Call() {
		
	}
	
	public void parseData(String data)
	{

//123:9874561230:2.5

this.callid=Integer.parseInt(data.substring(0,3));
this.calledNumber=Long.parseLong(data.substring(4,14));
this.duration=Float.parseFloat(data.substring(15));
	}
public int getCallid()
{return this.callid;}

public long getCalledNumber() {
	return calledNumber;
}

public float getDuration() {
	return duration;
}

}
public class task14 {	
	public static void main(String[]args) {
		
	Scanner sc=new Scanner(System.in);
	Call obj=new Call();
	String data=sc.nextLine();
	
	obj.parseData(data);
	System.out.println("call id:"+obj.getCallid());
	System.out.println("call no:"+obj.getCalledNumber());
	System.out.println("duration:"+obj.getDuration());
		
	}
}	