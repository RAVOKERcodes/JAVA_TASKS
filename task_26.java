package TASK;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class task_26 {
	
	//jdbc prepared statement
	//set serveroutput on (command line)
	//pl/sql what the heck is this
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","admin","admin");
		PreparedStatement stmt=con.prepareCall("{call myinsert(123,'hope',72398479)}");

		boolean status=stmt.execute();
		System.out.println("success "+status);
		con.close();
		}
}
	