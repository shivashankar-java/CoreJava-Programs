package Rowset;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WriteClob {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "root";

        String SQL = "INSERT INTO documents (doc_name, doc_content) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(SQL);
             FileReader filereader = new FileReader("C:\\Users\\Shivashankar\\OneDrive\\Desktop\\photos\\employees.xml")) {

            pstmt.setString(1, "employes1.txt");
            pstmt.setClob(2, filereader);
            int rows = pstmt.executeUpdate();

            if(rows>0) {
            	System.out.println("Document uploaded successfully!");
            }else {
            	System.out.println("Failed to upload document.");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

