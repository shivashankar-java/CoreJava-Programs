package Jdbc.pkg;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Callabletatement {

	public static void main(String[] args) throws SQLException {

		String url="jdbc:mysql://localhost:3306/vcube";
		String username="root";
		String password="root";
		
		Connection connection= DriverManager.getConnection(url, username, password);
		
//		CallableStatement cstmt = connection.prepareCall("{CALL getDetails()}");
		
		CallableStatement cstmt = connection.prepareCall("{getDetailsByempID(?)}");
		
		cstmt.setInt(1, 101);
		
		ResultSet rs=cstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2)+ "\t" + rs.getString(3));
		}
		
		connection.close();

	}
}
