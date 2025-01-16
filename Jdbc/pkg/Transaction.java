package Jdbc.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/vcube";
        String user = "root";
        String password = "root";

        try {
        	Connection con = DriverManager.getConnection(url, user, password);

        	con.setAutoCommit(false);

            String sql1 = "INSERT INTO accounts (account_id, balance) VALUES (?, ?)";
            String sql2 = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";

            try (PreparedStatement pstmt1 = con.prepareStatement(sql1);
                 PreparedStatement pstmt2 = con.prepareStatement(sql2)) {

                pstmt1.setInt(1, 3);
                pstmt1.setDouble(2, 800.00);
                pstmt1.executeUpdate();

                pstmt2.setInt(2, 3);
                pstmt2.setDouble(1, 200.00);              
                pstmt2.executeUpdate();

                con.commit();
                
                System.out.println("Transaction committed successfully.");
                
            } catch (SQLException ex) {

            	if (con != null) {
                	con.rollback();
                    System.out.println("Transaction rolled back due to an error.");
                }
                ex.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }    
    }
}
