package Jdbc.pkg;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Savepoint;
import java.sql.SQLException;

public class SavepointEx{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/vcube";
        String user = "root";
        String password = "root";

        try {
             Connection connection = DriverManager.getConnection(url, user, password);

             connection.setAutoCommit(false);

            String sql1 = "INSERT INTO accounts (account_id, balance) VALUES (?, ?)";
            String sql2 = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
            String sql3 = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";

            try (PreparedStatement pstmt1 = connection.prepareStatement(sql1);
                 PreparedStatement pstmt2 = connection.prepareStatement(sql2);
                 PreparedStatement pstmt3 = connection.prepareStatement(sql3)) {

                pstmt1.setInt(1, 1);
                pstmt1.setDouble(2, 500.00);
                pstmt1.executeUpdate();

                Savepoint savepoint = connection.setSavepoint("Savepoint1");

                pstmt2.setDouble(1, 100.00);  
                pstmt2.setInt(2, 1);
                pstmt2.executeUpdate();

                if (true) {
                    throw new SQLException("Simulated error");
                }

                pstmt3.setDouble(1, 100.00);
                pstmt3.setInt(2, 2);
                pstmt3.executeUpdate();

                connection.commit();
                
                System.out.println("Transaction committed successfully.");
            } catch (SQLException ex) {

            	System.out.println("Rolling back to Savepoint1...");
//                connection.rollback(savepoint);

               connection.commit(); 
                System.out.println("Transaction committed up to the savepoint.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
       
        }
    }
}

