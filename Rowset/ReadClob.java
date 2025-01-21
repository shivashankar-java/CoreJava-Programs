package Rowset;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadClob {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "root";

        String query = "SELECT doc_content FROM documents WHERE doc_name = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = connection.prepareStatement(query)) {

            pstmt.setString(1, "employes.txt");
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                Reader reader = rs.getCharacterStream("doc_content");
                FileWriter writer = new FileWriter("C:\\Users\\Shivashankar\\OneDrive\\Desktop\\photos\\abc.txt");

                BufferedReader br = new BufferedReader(reader);
                String line;
                while ((line = br.readLine()) != null) {
                    writer.write(line + "\n");
                }
                System.out.println("Document retrieved successfully!");
                writer.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

