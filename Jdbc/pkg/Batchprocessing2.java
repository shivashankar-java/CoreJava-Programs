package Jdbc.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Batchprocessing2 {

	public static void main(String[] args) {
		
		        String url = "jdbc:mysql://localhost:3306/jdbc";
		        String user = "root";
		        String password = "root";

		        String query = "INSERT INTO employees (id, name) VALUES (?, ?)";

		        try (Connection conn = DriverManager.getConnection(url, user, password);
		             PreparedStatement pstmt = conn.prepareStatement(query)) {

		            conn.setAutoCommit(false);

		            pstmt.setInt(1, 4);
		            pstmt.setString(2, "rahul");
		            pstmt.addBatch();

		            pstmt.setInt(1, 5);
		            pstmt.setString(2, "Eva");
		            pstmt.addBatch();

		            pstmt.setInt(1, 6);
		            pstmt.setString(2, "james");
		            pstmt.addBatch();

		            int[] results = pstmt.executeBatch();

		            conn.commit();

		            for (int result : results) {
		                System.out.println("Rows affected: " + result);
		            }

		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		}


