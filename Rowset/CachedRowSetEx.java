package Rowset;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetEx {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/dmantz";
            String username = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);

            connection.setAutoCommit(false);

            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.setUrl(url);
            crs.setUsername(username);
            crs.setPassword(password);

            crs.setCommand("SELECT id, name, salary FROM employees");
            crs.execute();

            while (crs.next()) {
                System.out.println("ID: " + crs.getInt("id"));
                System.out.println("Name: " + crs.getString("name"));
                System.out.println("Salary: " + crs.getDouble("salary"));
            }

            crs.absolute(1); 
            crs.updateDouble("salary", 30000); 
            crs.updateRow();

            crs.acceptChanges(connection);

            System.out.println("Salary updated successfully");

            connection.setAutoCommit(true);

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}

