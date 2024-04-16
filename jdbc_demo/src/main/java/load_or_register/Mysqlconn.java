package load_or_register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysqlconn {
	
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/SQLPLUS";
		String user="root";
		String pwd="ashish0809";
		
		try {
			Connection con= DriverManager.getConnection(url,user,pwd);
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from EMP");
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" "+rs.getString(2));
				

			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Connection Established");
		
	}

}