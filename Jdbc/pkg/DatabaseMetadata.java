package Jdbc.pkg;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseMetadata {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/vcube";
		String username="root";
		String password="root";
		
		try(Connection conn= DriverManager.getConnection(url, username, password)) {
			Statement st=conn.createStatement();
			
			DatabaseMetaData dbmd=conn.getMetaData();
			
			System.out.println("Database product name :" + dbmd.getDatabaseProductName());		
			System.out.println("Database product version :" + dbmd.getDatabaseProductVersion());
		    System.out.println("Database Driver name :" + dbmd.getDriverName());
		    System.out.println("Database Driver version :" + dbmd.getDriverVersion());
		    System.out.println("Support transcations : " + dbmd.supportsBatchUpdates());
		   
		    
		 }catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

}
