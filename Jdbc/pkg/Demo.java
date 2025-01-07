package Jdbc.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		String url = "jdbc:mysql://localhost:3306/vcube";
//		String username = "root";
//		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");
		
   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/vcube", "root", "root");
		
		Statement st = con.createStatement();
		String sql="select stdid,sname,smarks from student";
		
		 ResultSet rs=st.executeQuery(sql);
		 
		 while(rs.next()) {
			 int stdid=rs.getInt("stdid");
			 String sname=rs.getString("sname");
			 int smarks =rs.getInt("smarks"); 
			 
			 System.out.println(stdid+"    "+sname+"    "+smarks);
			 
		 }
		
		con.close();	
	}
}


