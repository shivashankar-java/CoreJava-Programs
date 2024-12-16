package pkg.csv;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class BookManagement {
    private static final String FILE_PATH = "E:\\Dmantz\\ReadBook.csv";

    public static List<Book> loadBooks() {
        List<Book> books = new ArrayList<>();
        List<String[]> data = CSVReaderWriter.readCSV(FILE_PATH);

        for (String[] row : data) {
            if (row.length < 4) {
                System.err.println("Invalid row: " + String.join(",", row));
                continue;
            }

            String id = row[0];
            String title = row[1];
            String author = row[2];
            String category = row[3];

            books.add(new Book(id, title, author, category));
            
        }

        return books;
    }

   
    public static boolean removeBookById(String bookId) {
        // Load the books from the CSV file
        List<Book> books = loadBooks();
        
        // Find the book to remove using its ID
        Optional<Book> bookToRemove = books.stream()
                                           .filter(book -> book.getId().equals(bookId))
                                           .findFirst();
        
        // If the book is found, remove it
        if (bookToRemove.isPresent()) {
            books.remove(bookToRemove.get()); // Remove the book from the list
            
            // Save the updated list back to the CSV file
            saveBooks(books);
            
            // Confirm the removal
            System.out.println("Book removed: " + bookToRemove.get());
            return true;
        } else {
            // Book not found
            System.err.println("Book not found with ID: " + bookId);
            return false;
        }
    }


    
    public static void saveBooks(List<Book> books) {
        List<String[]> data = new ArrayList<>();
        for (Book book : books) {
            data.add(book.toCSVRow());
        }
        CSVReaderWriter.writeCSV(FILE_PATH, data);
    }
    
}


