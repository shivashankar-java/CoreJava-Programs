package Rowset;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadBlob {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "root";

        String query = "SELECT file_data FROM files WHERE file_name = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = connection.prepareStatement(query)) {

            pstmt.setString(1, "java.jpg");
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                InputStream is = rs.getBinaryStream("file_data");
           FileOutputStream fos = new FileOutputStream("C:\\Users\\Shivashankar\\OneDrive\\Desktop\\photos\\abc.jpg");

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = is.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
                System.out.println("File retrieved successfully!");
                fos.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

