package Library.pkg;

import java.sql.SQLException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws SQLException {
    	
    	Librarian librarian = new Librarian();
        Scanner scanner = new Scanner(System.in);
        

        while (true) {
            System.out.println("\nLibrary System");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Check Book Availability");
            System.out.println("5. View All Books");
            System.out.println("6. Add Reader");
            System.out.println("7. View All Readers");
            System.out.println("8. Update Reader");
            System.out.println("9. Delete Reader");
            System.out.println("10. Add Rack");
            System.out.println("11. View All Racks");
            System.out.println("12. Update Rack");
            System.out.println("13. Delete Rack");
            System.out.println("14. Add Age Category");
            System.out.println("15. View All Age Categories");
            System.out.println("16. Update Age Category");
            System.out.println("17. Delete Age Category");
            System.out.println("18. Exit.");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();

                    System.out.print("Enter book author: ");
                    String bookAuthor = scanner.nextLine();

                    System.out.print("Enter rack ID: ");
                    int rackId = scanner.nextInt();

                    System.out.print("Enter age category ID: ");
                    int ageCategoryId = scanner.nextInt();

                    librarian.addBook(bookTitle, bookAuthor, rackId, ageCategoryId);
                    break;

                case 2:
                    System.out.print("Enter book ID to update: ");
                    int bookIdToUpdate = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new title: ");
                    String newBookTitle = scanner.nextLine();

                    System.out.print("Enter new author: ");
                    String newBookAuthor = scanner.nextLine();

                    System.out.print("Enter new rack ID: ");
                    int newRackId = scanner.nextInt();

                    System.out.print("Enter new age category ID: ");
                    int newAgeCategoryId = scanner.nextInt();

                    librarian.updateBook(bookIdToUpdate, newBookTitle, newBookAuthor, newRackId, newAgeCategoryId);
                    break;

                case 3:
                    System.out.print("Enter book ID to delete: ");
                    int bookIdToDelete = scanner.nextInt();
                    librarian.deleteBook(bookIdToDelete);
                    break;

                case 4:
                    System.out.print("Enter book ID to check availability: ");
                    int bookIdToCheck = scanner.nextInt();
                    librarian.checkBookAvailability(bookIdToCheck);
                    break;

                case 5:
                	librarian.viewAllBooks();
                    break;

                case 6:
                    System.out.print("Enter reader's name: ");
                    String readerName = scanner.nextLine();

                    System.out.print("Enter reader's age: ");
                    int readerAge = scanner.nextInt();

                    librarian.addReader(readerName, readerAge);
                    break;

                case 7:
                	librarian.viewAllReaders();
                    break;

                case 8:
                    System.out.print("Enter reader ID to update: ");
                    int readerIdToUpdate = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new name: ");
                    String newReaderName = scanner.nextLine();

                    System.out.print("Enter new age: ");
                    int newReaderAge = scanner.nextInt();

                    librarian.updateReader(readerIdToUpdate, newReaderName, newReaderAge);
                    break;

                case 9:
                    System.out.print("Enter reader ID to delete: ");
                    int readerIdToDelete = scanner.nextInt();
                    librarian.deleteReader(readerIdToDelete);
                    break;

                case 10:
                    System.out.print("Enter rack location: ");
                    String rackLocation = scanner.nextLine();

                    librarian.addRack(rackLocation);
                    break;

                case 11:
                	librarian.viewAllRacks();
                    break;

                case 12:
                    System.out.print("Enter rack ID to update: ");
                    int rackIdToUpdate = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new rack location: ");
                    String newRackLocation = scanner.nextLine();

                    librarian.updateRack(rackIdToUpdate, newRackLocation);
                    break;

                case 13:
                    System.out.print("Enter rack ID to delete: ");
                    int rackIdToDelete = scanner.nextInt();
                    librarian.deleteRack(rackIdToDelete);
                    break;

                case 14:
                    System.out.print("Enter age category name: ");
                    String categoryName = scanner.nextLine();

                    System.out.print("Enter minimum age: ");
                    int minAge = scanner.nextInt();

                    System.out.print("Enter maximum age: ");
                    int maxAge = scanner.nextInt();

                    librarian.addAgeCategory(categoryName, minAge, maxAge);
                    break;

                case 15:
                	librarian.viewAllAgeCategories();
                    break;

                case 16:
                    System.out.print("Enter age category ID to update: ");
                    int categoryIdToUpdate = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new category name: ");
                    String newCategoryName = scanner.nextLine();

                    System.out.print("Enter new minimum age: ");
                    int newMinAge = scanner.nextInt();

                    System.out.print("Enter new maximum age: ");
                    int newMaxAge = scanner.nextInt();

                    librarian.updateAgeCategory(categoryIdToUpdate, newCategoryName, newMinAge, newMaxAge);
                    break;

                case 17:
                    System.out.print("Enter age category ID to delete: ");
                    int categoryIdToDelete = scanner.nextInt();
                    librarian.deleteAgeCategory(categoryIdToDelete);
                    break;

                case 18:
                    System.out.println("Exiting the librarysystem.");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
                    
                    
                 Librarian librarian1 = new Librarian();                
//                    librarian1.addBook("java", "JamesGosling", 3,3);
//                    librarian1.deleteBook(1);
                     
                    
            }
        }
    }
}

