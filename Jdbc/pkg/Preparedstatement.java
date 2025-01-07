package Jdbc.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Preparedstatement{
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcube", "root", "root");
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id = ?")) {
             
            ps.setInt(1, 1); 
            
      
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID") + ", Name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




