package Jdbc.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dmantz";
        String username = "root";                       
        String password = "root";                  

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
        	conn = DriverManager.getConnection(url, username, password);

        	stmt = conn.createStatement();

            String selectQuery = "SELECT id, name, salary FROM emp";
            rs = stmt.executeQuery(selectQuery);

            System.out.println("Emp Details:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }

            String updateQuery = "UPDATE emp SET salary = 55000 WHERE id = 1";
            int rowsUpdated = stmt.executeUpdate(updateQuery);
            System.out.println("Rows updated: " + rowsUpdated);

            String insertQuery = "INSERT INTO emp (id, name, salary) VALUES (4, 'Charlie', 70000)";
            int rowsInserted = stmt.executeUpdate(insertQuery);
            System.out.println("Rows inserted: " + rowsInserted);

            String deleteQuery = "DELETE FROM emp WHERE id = 2";
            int rowsDeleted = stmt.executeUpdate(deleteQuery);
            System.out.println("Rows deleted: " + rowsDeleted);

        } catch (Exception e) {
            e.printStackTrace();
           } 
        
        }
    }


