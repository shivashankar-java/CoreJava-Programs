package Rowset;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WriteBlob {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "root";

        String insertSQL = "INSERT INTO files (file_name, file_data) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL);
             FileInputStream fis = new FileInputStream("C:\\Users\\Shivashankar\\OneDrive\\Desktop\\photos\\Extracted image.png")) {

            pstmt.setString(1, "java.jpg");
            pstmt.setBlob(2, fis);
            int rows = pstmt.executeUpdate();

            System.out.println(rows > 0 ? "File uploaded successfully!" : "Failed to upload file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

