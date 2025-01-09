package Jdbc.pkg;

	import java.io.File;
	import java.io.FileInputStream;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

public class StoreFileInDatabase {

	 public static void main(String[] args) {
	       String filePath ="C:\\Users\\Shivashankar\\OneDrive\\Desktop\\files\\sign.pdf"; 
	       String fileName = "sign.pdf";
	       String fileType = "application/pdf";

	        storeFile(filePath, fileName, fileType);
	    }

	    public static void storeFile(String filePath, String fileName, String fileType) {
	        // Database connection details
	        String URL = "jdbc:mysql://localhost:3306/vcube";
	        String USER = "root";
	        String PASSWORD = "root";

	        String insertQuery = "INSERT INTO Files (name, type, data) VALUES (?, ?, ?)";

	        try (
	            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
	            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
	            FileInputStream fileInputStream = new FileInputStream(new File(filePath))
	        ) {         
	            preparedStatement.setString(1, fileName);	    
	            preparedStatement.setString(2, fileType);	      
	            preparedStatement.setBinaryStream(3, fileInputStream);

	            int rowsInserted = preparedStatement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("File stored successfully.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


