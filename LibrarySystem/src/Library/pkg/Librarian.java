package Library.pkg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Librarian {
	    public void addBook(String title, String author, int rackId, int ageCategoryId) {
	        String sql = "INSERT INTO books (title, author, rack_id, age_category_id) VALUES (?, ?, ?, ?)";

	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

	            preparedStatement.setString(1, title);
	            preparedStatement.setString(2, author);
	            preparedStatement.setInt(3, rackId);
	            preparedStatement.setInt(4, ageCategoryId);

	            int rows = preparedStatement.executeUpdate();
	            System.out.println("Book added successfully. Rows affected: " + rows);
	        } catch (SQLException e) {
	            System.err.println("Error adding book: " + e.getMessage());
	        }
	    }

	    public void updateBook(int bookId, String newTitle, String newAuthor, int newRackId, int newAgeCategoryId) {
	        String sql = "UPDATE books SET title = ?, author = ?, rack_id = ?, age_category_id = ? WHERE book_id = ?";

	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

	            preparedStatement.setString(1, newTitle);
	            preparedStatement.setString(2, newAuthor);
	            preparedStatement.setInt(3, newRackId);
	            preparedStatement.setInt(4, newAgeCategoryId);
	            preparedStatement.setInt(5, bookId);

	            int rows = preparedStatement.executeUpdate();
	            System.out.println("Book updated successfully. Rows affected: " + rows);
	        } catch (SQLException e) {
	            System.err.println("Error updating book: " + e.getMessage());
	        }
	    }

	    
	    public void deleteBook(int bookId) {
	        String sql = "DELETE FROM books WHERE book_id = ?";

	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

	            preparedStatement.setInt(1, bookId);

	            int rows = preparedStatement.executeUpdate();
	            System.out.println("Book deleted successfully. Rows affected: " + rows);
	        } catch (SQLException e) {
	            System.err.println("Error deleting book: " + e.getMessage());
	        }
	    }

	    public void checkBookAvailability(int bookId) {
	        String sql = "SELECT * FROM books WHERE book_id = ?";

	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

	            preparedStatement.setInt(1, bookId);

	            try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                if (resultSet.next()) {
	                    String title = resultSet.getString("title");
	                    System.out.println("Book [ID=" + bookId + ", Title=" + title + "] is available.");
	                } else {
	                    System.out.println("Book [ID=" + bookId + "] is not available.");
	                }
	            }
	        } catch (SQLException e) {
	            System.err.println("Error checking book availability: " + e.getMessage());
	        }
	    }

	    
	    
	    public void viewAllBooks() {
	        String sql = "SELECT * FROM books";

	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql);
	             ResultSet resultSet = preparedStatement.executeQuery()) {

	            while (resultSet.next()) {
	                int id = resultSet.getInt("book_id");
	                String title = resultSet.getString("title");
	                String author = resultSet.getString("author");
	                int rackId = resultSet.getInt("rack_id");
	                int ageCategoryId = resultSet.getInt("age_category_id");

	                System.out.println("Book [ID=" + id + ", Title=" + title + ", Author=" + author +
	                        ", Rack ID=" + rackId + ", Age Category ID=" + ageCategoryId + "]");
	            }
	        } catch (SQLException e) {
	            System.err.println("Error retrieving books: " + e.getMessage());
	        }
	    }
	    
	    
//	    reader class by librarian...................................................................................
	    
	    public void addReader(String name, int age) {
	        String sql = "INSERT INTO readers (name, age) VALUES (?, ?)";
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

	            preparedStatement.setString(1, name);
	            preparedStatement.setInt(2, age);

	            int rows = preparedStatement.executeUpdate();
	            System.out.println("Reader added successfully. Rows affected: " + rows);
	        } catch (SQLException e) {
	            System.err.println("Error adding reader: " + e.getMessage());
	        }
	    }

	    // View all readers
	    public void viewAllReaders() {
	        String sql = "SELECT * FROM readers";
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql);
	             ResultSet resultSet = preparedStatement.executeQuery()) {

	            while (resultSet.next()) {
	                int readerId = resultSet.getInt("reader_id");
	                String name = resultSet.getString("name");
	                int age = resultSet.getInt("age");
	                int borrowedBookId = resultSet.getInt("borrowed_book_id");

	                System.out.println("Reader [ID=" + readerId + ", Name=" + name +
	                                   ", Age=" + age + ", Borrowed Book ID=" + borrowedBookId + "]");
	            }
	        } catch (SQLException e) {
	            System.err.println("Error retrieving readers: " + e.getMessage());
	        }
	    }

	    // Update reader information
	    public void updateReader(int readerId, String newName, int newAge) {
	        String sql = "UPDATE readers SET name = ?, age = ? WHERE reader_id = ?";
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

	            preparedStatement.setString(1, newName);
	            preparedStatement.setInt(2, newAge);
	            preparedStatement.setInt(3, readerId);

	            int rows = preparedStatement.executeUpdate();
	            System.out.println("Reader updated successfully. Rows affected: " + rows);
	        } catch (SQLException e) {
	            System.err.println("Error updating reader: " + e.getMessage());
	        }
	    }

	    // Delete a reader
	    public void deleteReader(int readerId) {
	        String sql = "DELETE FROM readers WHERE reader_id = ?";
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

	            preparedStatement.setInt(1, readerId);

	            int rows = preparedStatement.executeUpdate();
	            System.out.println("Reader deleted successfully. Rows affected: " + rows);
	        } catch (SQLException e) {
	            System.err.println("Error deleting reader: " + e.getMessage());
	        }
	}
	
	  
	    
	 // Add a new rack..............................................
	    
	    public void addRack(String location) {
	        String sql = "INSERT INTO racks (location) VALUES (?)";
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

	            preparedStatement.setString(1, location);

	            int rows = preparedStatement.executeUpdate();
	            System.out.println("Rack added successfully. Rows affected: " + rows);
	        } catch (SQLException e) {
	            System.err.println("Error adding rack: " + e.getMessage());
	        }
	    }

	    // View all racks
	    public void viewAllRacks() {
	        String sql = "SELECT * FROM racks";
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql);
	             ResultSet resultSet = preparedStatement.executeQuery()) {

	            while (resultSet.next()) {
	                int rackId = resultSet.getInt("rack_id");
	                String location = resultSet.getString("location");

	                System.out.println("Rack [ID=" + rackId + ", Location=" + location + "]");
	            }
	        } catch (SQLException e) {
	            System.err.println("Error retrieving racks: " + e.getMessage());
	        }
	    }

	    // Update rack location
	    public void updateRack(int rackId, String newLocation) {
	        String sql = "UPDATE racks SET location = ? WHERE rack_id = ?";
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

	            preparedStatement.setString(1, newLocation);
	            preparedStatement.setInt(2, rackId);

	            int rows = preparedStatement.executeUpdate();
	            System.out.println("Rack updated successfully. Rows affected: " + rows);
	        } catch (SQLException e) {
	            System.err.println("Error updating rack: " + e.getMessage());
	        }
	    }

	    // Delete a rack
	    public void deleteRack(int rackId) {
	        String sql = "DELETE FROM racks WHERE rack_id = ?";
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

	            preparedStatement.setInt(1, rackId);

	            int rows = preparedStatement.executeUpdate();
	            System.out.println("Rack deleted successfully. Rows affected: " + rows);
	        } catch (SQLException e) {
	            System.err.println("Error deleting rack: " + e.getMessage());
	        }
	    }

	    
	 // Add a new age category........................................................................................
	    
	    public void addAgeCategory(String categoryName, int minAge, int maxAge) {
	        String sql = "INSERT INTO age_categories (category_name, min_age, max_age) VALUES (?, ?, ?)";
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

	            preparedStatement.setString(1, categoryName);
	            preparedStatement.setInt(2, minAge);
	            preparedStatement.setInt(3, maxAge);

	            int rows = preparedStatement.executeUpdate();
	            System.out.println("Age category added successfully. Rows affected: " + rows);
	        } catch (SQLException e) {
	            System.err.println("Error adding age category: " + e.getMessage());
	        }
	    }

	    // View all age categories
	    public void viewAllAgeCategories() {
	        String sql = "SELECT * FROM age_categories";
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql);
	             ResultSet resultSet = preparedStatement.executeQuery()) {

	            while (resultSet.next()) {
	                int categoryId = resultSet.getInt("age_category_id");
	                String categoryName = resultSet.getString("category_name");
	                int minAge = resultSet.getInt("min_age");
	                int maxAge = resultSet.getInt("max_age");

	                System.out.println("Age Category [ID=" + categoryId + ", Name=" + categoryName +
	                                   ", Min Age=" + minAge + ", Max Age=" + maxAge + "]");
	            }
	        } catch (SQLException e) {
	            System.err.println("Error retrieving age categories: " + e.getMessage());
	        }
	    }

	    // Update an age category
	    public void updateAgeCategory(int categoryId, String newCategoryName, int newMinAge, int newMaxAge) {
	        String sql = "UPDATE age_categories SET category_name = ?, min_age = ?, max_age = ? WHERE age_category_id = ?";
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

	            preparedStatement.setString(1, newCategoryName);
	            preparedStatement.setInt(2, newMinAge);
	            preparedStatement.setInt(3, newMaxAge);
	            preparedStatement.setInt(4, categoryId);

	            int rows = preparedStatement.executeUpdate();
	            System.out.println("Age category updated successfully. Rows affected: " + rows);
	        } catch (SQLException e) {
	            System.err.println("Error updating age category: " + e.getMessage());
	        }
	    }

	    // Delete an age category
	    public void deleteAgeCategory(int categoryId) {
	        String sql = "DELETE FROM age_categories WHERE age_category_id = ?";
	        try (Connection connection = DatabaseConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

	            preparedStatement.setInt(1, categoryId);

	            int rows = preparedStatement.executeUpdate();
	            System.out.println("Age category deleted successfully. Rows affected: " + rows);
	        } catch (SQLException e) {
	            System.err.println("Error deleting age category: " + e.getMessage());
	        }
	    }

	  
}


