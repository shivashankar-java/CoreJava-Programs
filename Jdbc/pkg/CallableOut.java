package Jdbc.pkg;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableOut {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/vcube";
		String username="root";
		String password="root";
		
		try(Connection conn=DriverManager.getConnection(url, username, password);
		    CallableStatement cstmt=conn.prepareCall("{CALL getDetailsByOut(?)}")){
				cstmt.setInt(1, Types.INTEGER);
				cstmt.execute();
				
				int cnt = cstmt.getInt(1);
				System.out.println("No of rows present in employee :"+ cnt);
				conn.close();
			}

	}

}
