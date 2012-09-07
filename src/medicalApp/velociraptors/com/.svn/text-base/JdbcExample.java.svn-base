package medicalApp.velociraptors.com;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcExample {
	public static void main(String[] args){
		Connection con = null; 
		try { 
			Class.forName("com.mysql.jdbc.Driver").newInstance(); 
			con = DriverManager.getConnection("jdbc:mysql://localhost/velociraptorsattack", "root", ""); 
			if(!con.isClosed()) 
				System.out.println("Successfully connected to " + 
				"MySQL server using TCP/IP..."); 
		} catch(Exception e) { 
			System.err.println("Exception: " + e.getMessage());
		}
	}
}

