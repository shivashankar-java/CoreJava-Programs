package Jdbc.pkg;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveFileFromDatabase {

    public static void main(String[] args) {
        String outputPath = "C:\\Users\\Shivashankar\\OneDrive\\Desktop\\photos\\abc.pdf"; 
        int fileId = 1; // ID of the file to retrieve from the database

        retrieveFile(fileId, outputPath);
    }

    public static void retrieveFile(int fileId, String outputPath) {
        // Database connection details
        String DB_URL = "jdbc:mysql://localhost:3306/vcube";
        String DB_USER = "root";
        String DB_PASSWORD = "root";

        String selectQuery = "SELECT name, data FROM Files WHERE id = ?";

        try (
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)
        ) {
            preparedStatement.setInt(1, fileId);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String fileName = resultSet.getString("name");
                byte[] fileData = resultSet.getBytes("data");

                try (FileOutputStream fileOutputStream = new FileOutputStream(outputPath)) {
                    fileOutputStream.write(fileData);
                    System.out.println("File retrieved successfully: " + fileName);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

