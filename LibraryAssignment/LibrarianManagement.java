package pkg.csv;

import java.util.*;

import java.util.*;

public class LibrarianManagement {
    private static final String FILE_PATH = "E:\\Dmantz\\ReadLibrarian.csv";
    private static final String BOOK_FILE_PATH = "E:\\Dmantz\\ReadBook.csv"; // File path for books

    // Load librarians from CSV
    public static List<Librarian> loadLibrarians() {
        List<Librarian> librarians = new ArrayList<>();
        List<String[]> data = CSVReaderWriter.readCSV(FILE_PATH);

        for (String[] row : data) {
            if (row.length < 3) {
                System.err.println("Invalid row: " + String.join(",", row));
                continue;
            }

            String id = row[0];
            String name = row[1];
            String email = row[2];

            librarians.add(new Librarian(id, name, email));
        }

        return librarians;
    }

    // Save librarians to CSV
    public static void saveLibrarians(List<Librarian> librarians) {
        List<String[]> data = new ArrayList<>();
        for (Librarian librarian : librarians) {
            data.add(librarian.toCSVRow());
        }
        CSVReaderWriter.writeCSV(FILE_PATH, data);
    }

    // Add a new book method
    public static void addBook(Book newBook) {
        List<Book> books = BookManagement.loadBooks(); // Load current books
        books.add(newBook); // Add the new book to the list
        BookManagement.saveBooks(books); // Save the updated list of books
        System.out.println("New Book Added: " + newBook.getTitle());
    }

    // Remove a book by its ID method
    public static void removeBook(String bookId) {
        List<Book> books = BookManagement.loadBooks(); // Load current books
        boolean removed = books.removeIf(book -> book.getId().equals(bookId)); // Remove book by ID

        if (removed) {
            BookManagement.saveBooks(books); // Save the updated list back to the CSV
            System.out.println("Book with ID " + bookId + " has been removed.");
        } else {
            System.err.println("No book found with ID: " + bookId);
        }
    }

}



//public class LibrarianManagement {
//    private static final String FILE_PATH = "E:/Dmantz/Librarian.csv";
//
//    public static List<Librarian> loadLibrarians() {
//        List<Librarian> librarians = new ArrayList<>();
//        List<String[]> data = CSVReaderWriter.readCSV(FILE_PATH);
//
//        for (String[] row : data) {
//            if (row.length < 3) {
//                System.err.println("Invalid row: " + String.join(",", row));
//                continue;
//            }
//
//            String id = row[0];
//            String name = row[1];
//            String email = row[2];
//
//            librarians.add(new Librarian(id, name, email));
//        }
//
//        return librarians;
//    }
//
//    public static void saveLibrarians(List<Librarian> librarians) {
//        List<String[]> data = new ArrayList<>();
//        for (Librarian librarian : librarians) {
//            data.add(librarian.toCSVRow());
//        }
//        CSVReaderWriter.writeCSV(FILE_PATH, data);
//    } 
//}


