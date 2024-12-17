package pkg.LibraryAssignment;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    	 
//        List<Reader> readers = ReaderManagement.loadReaders();
//        System.out.println("Loaded Readers:");
//        for (Reader reader : readers) {
//            System.out.println("ID: " + reader.getId() + ", Name: " + reader.getName() + ", Email: " + reader.getEmail() + ", Age Category: " + reader.getAge());
//        }
////         Add a new reader and save
//        Reader reader = new Reader("R005", "Sam", "sam@.com", "45");
//        readers.add(reader); 
//        
//        ReaderManagement.updateReader("R003", "Rakesh", "mahesh@example.com", "38");
//        System.out.println("kkkkkkkkkkkkkkkkkk");
//           System.out.println(readers);
//        
////        ReaderManagement.saveReaders(readers);
//        System.out.println("\nNew Reader Added and Saved to CSV File.");

    	
    	
       // Load librarians from CSV
//        List<Librarian> librarians = LibrarianManagement.loadLibrarians();
//        System.out.println("Loaded Librarians:");
//        for (Librarian librarian : librarians) {
//           System.out.println("ID: " + librarian.getId() + ", Name: " + librarian.getName() + ", Email: " + librarian.getEmail());
//        }
//
//        // Add a new librarian and save
//        Librarian newLibrarian = new Librarian("L004", "Ramesh", "ramesh@.com");
//       librarians.add(newLibrarian);
//        LibrarianManagement.saveLibrarians(librarians);
//        System.out.println("\nNew Librarian Added and Saved to CSV.");
//        
//        String bookIdToRemove = "B002"; 
//        LibrarianManagement.removeBook(bookIdToRemove);
       


        // Load books from CSV
        List<Book> books = BookManagement.loadBooks();
        System.out.println("Loaded Books:");
        for (Book book : books) {
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Category: " + book.getCategory());
        }
         // Add a new book and save
        Book newBook = new Book("B00", "PowerElectronics", "vvChary", "Engineering");
        books.add(newBook);
        
        String bookIdToRemove = "B002";  // Example ID
        boolean removed = BookManagement.removeBookById(bookIdToRemove); 
        
        List<Reader> readersByName = ReaderManagement.searchReadersByName("srinu");
        readersByName.forEach(reader -> System.out.println("Reader with name 'srinu': " + reader));
        
        // BookManagement.saveBooks(books);
        System.out.println("\nNew Book Added and Saved to CSV File.");
        


//        // Load racks from CSV
//        List<Rack> racks = RackManagement.loadRacks();
//        System.out.println("Loaded Racks:");
//        for (Rack rack : racks) {
//            System.out.println("ID: " + rack.getId() + ", Location: " + rack.getLocation());
//        }
//
//        // Add a new rack and save
//        Rack newRack = new Rack("R003", "Section-C");
//        racks.add(newRack);
//        RackManagement.saveRacks(racks);
//        System.out.println("\nNew Rack Added and Saved to CSV File.");
        


        // Load age categories from CSV
//        List<AgeCategory> ageCategories = AgeCategoryManagement.loadAgeCategories();
//        System.out.println("Loaded Age Categories:");
//        for (AgeCategory ageCategory : ageCategories) {
//            System.out.println("ID: " + ageCategory.getId() + ", Category: " + ageCategory.getCategoryName());
//        }
//
//        // Add a new age category and save
//        AgeCategory newAgeCategory = new AgeCategory("AC003", "Child");
//        ageCategories.add(newAgeCategory);
//        AgeCategoryManagement.saveAgeCategories(ageCategories);
//        System.out.println("\nNew Age Category Added and Saved to CSV File.");
           
         

    }
}

