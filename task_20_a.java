package TASK;

interface JDBC{
	void connect();
	void disconnect();
}
class Oracleimpl implements JDBC{
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connected oracle");
	}
	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnected oracle");
	}	
}
class Mysql implements JDBC{
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connected mysql");
	}
	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnected mysql");
	}	
}
public class task_20_a {
	public static void main(String[] args) {
//interface implementation// JDBC library
//connect data base with c,java
		JDBC j=new Oracleimpl();	
		j.connect();
		j.disconnect();
		j=new Mysql();
		j.connect();
		j.disconnect();
	}
}
