package Rowset;

import javax.sql.rowset.WebRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.SQLException;

public class WebRowSetEx {
    public static void main(String[] args) {
     
    	 try {
         	RowSetFactory rsf =RowSetProvider.newFactory();
             WebRowSet wrs=rsf.createWebRowSet();
             
             wrs.setUrl("jdbc:mysql://localhost:3306/dmantz"); 
             wrs.setUsername("root");                      
             wrs.setPassword("root");                 
             wrs.setCommand("SELECT * FROM employees");            
             wrs.execute();                                         

             System.out.println("Data Retrieved:");
             while (wrs.next()) {
                 int id = wrs.getInt("ID");                        
                 String name = wrs.getString("Name");               
                 double salary = wrs.getDouble("Salary");           
                 System.out.println("ID: " + id);
                 System.out.println("Name: " + name);
                 System.out.println("Salary: " + salary);
             }

            System.out.println("\nWriting data to XML file...");
            try (FileWriter writer = new FileWriter("employees.xml")) {
            	wrs.writeXml(writer);
                System.out.println("Data successfully written to employees.xml.");
            }          
            wrs.beforeFirst(); 
            
            System.out.println("\nReading data back from XML file...");
            try (FileReader reader = new FileReader("employees.xml")) {
                wrs.readXml(reader);  
                System.out.println("Data successfully read from employees.xml.");
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            System.out.println("\nData Read from XML:");
            while (wrs.next()) {  
                int id = wrs.getInt("ID");
                String name = wrs.getString("Name");
                double salary = wrs.getDouble("Salary");
                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
