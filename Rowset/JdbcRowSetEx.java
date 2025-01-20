package Rowset;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetEx {
    public static void main(String[] args) {
        try {
            RowSetFactory rsf =RowSetProvider.newFactory();
            JdbcRowSet rs=rsf.createJdbcRowSet();

            rs.setUrl("jdbc:mysql://localhost:3306/dmantz");
            rs.setUsername("root");
            rs.setPassword("root");

            rs.setCommand("SELECT id, name, salary FROM employees");
            rs.execute();

            System.out.println("\nForward Direction");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Salary: " + rs.getDouble("salary"));
            }
            
            System.out.println("\nBackward Direction");
            while(rs.previous()) {
            	System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Salary: " + rs.getDouble("salary"));
            }                               
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


