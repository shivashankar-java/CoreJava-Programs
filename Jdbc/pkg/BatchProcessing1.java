package Jdbc.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing1 {
 public static void main(String[] args) throws SQLException{
	
	 String url = "jdbc:mysql://localhost:3306/jdbc";
     String user = "root";
     String password = "root";
     
     try(Connection con=DriverManager.getConnection(url, user, password);
    		 Statement st = con.createStatement()){
    	 
    	 con.setAutoCommit(false);
    	 
    	 st.addBatch("Insert into employees(id,name) values (1,'shiva')");
    	 st.addBatch("Insert into employees(id,name) values (2,'ramu')");
    	 st.addBatch("Insert into employees(id,name) values (3,'vinay')");
    	 
    	 int[] results =st.executeBatch();
    	 
    	 con.commit();
    	 
    	 for(int result: results) {
    		 System.out.println("Rows affected:"+ results);
    		
    	 }    	     	 
     }catch(Exception e) {
    	e.printStackTrace();
     }
  }
}
