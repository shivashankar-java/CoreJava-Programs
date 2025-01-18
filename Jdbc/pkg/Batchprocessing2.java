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

		            pstmt.setInt(1, 7);
		            pstmt.setString(2, "Asha");
		            pstmt.addBatch();

		            pstmt.setInt(1, 8);
		            pstmt.setString(2, "Shami");
		            pstmt.addBatch();

		            pstmt.setInt(1, 9);
		            pstmt.setString(2, "Virat");
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


