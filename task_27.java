package TASK;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class task_27 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","admin","admin");
		CallableStatement stmt=con.prepareCall("{call myinsert(?,?,?)}");
		stmt.setInt(1, 0007711);
		stmt.setString(2,"mere ram");
		stmt.setFloat(3, 7777);
		boolean status=stmt.execute();
		System.out.println("success "+status);
		con.close();
		}
}
