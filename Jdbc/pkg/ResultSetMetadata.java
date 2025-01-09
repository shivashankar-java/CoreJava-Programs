package Jdbc.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetadata {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/vcube";
		String username="root";
		String password="root";
		
		try(Connection conn=DriverManager.getConnection(url, username, password)) {
			String sql="Select * from Employee";
			
			Statement st=conn.createStatement();
			ResultSet rs =st.executeQuery(sql);
			
			ResultSetMetaData rsmd=rs.getMetaData();
			
			int columnCount=rsmd.getColumnCount();
			
			System.out.println("Number of colums :"+  columnCount);
			
			System.out.println("Name:"+ rsmd.getColumnClassName(1));
			
			System.out.println("Type :" + rsmd.getColumnType(2));
			
			System.out.println("Table name :" + rsmd.getTableName(1));
			
			
		}catch (SQLException e) {
            e.printStackTrace();
        }
	}

}
