package Rowset;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CachedRowSetEx {
    public static void main(String[] args) {       
        try {
        	RowSetFactory rsf =RowSetProvider.newFactory();
            CachedRowSet crs=rsf.createCachedRowSet();
            
            crs.setUrl("jdbc:mysql://localhost:3306/dmantz"); 
            crs.setUsername("root");                      
            crs.setPassword("root");                 
            crs.setCommand("SELECT * FROM employees");            
            crs.execute();                                         

            System.out.println("Data Retrieved:");
            while (crs.next()) {
                int id = crs.getInt("ID");                        
                String name = crs.getString("Name");               
                double salary = crs.getDouble("Salary");           
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Salary: " + salary);
            }

            System.out.println("\nUpdating Data...");
            crs.beforeFirst(); 
            if (crs.next()) { 
            	crs.absolute(2);
            	crs.updateString("name", "Mahesh"); 
            	crs.updateRow(); 
            }

          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dmantz","root","root");
           conn.setAutoCommit(false); 
            crs.acceptChanges(conn);
            System.out.println("Data updated successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}
