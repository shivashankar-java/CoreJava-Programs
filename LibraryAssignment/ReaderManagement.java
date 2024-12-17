package pkg.LibraryAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReaderManagement {
    private static final String FILE_PATH = "E:\\Dmantz\\readReader.csv";

    public static List<Reader> loadReaders() {
        List<Reader> readers = new ArrayList<>();
        List<String[]> data = CSVReaderWriter.readCSV(FILE_PATH);

        for (String[] row : data) {
            if (row.length < 4) {
                System.err.println("Invalid row: " + String.join(",", row));
                continue; 
            }

            String id = row[0];
            String name = row[1];
            String email = row[2];
            String age = row[3];

            readers.add(new Reader(id, name, email, age));
        }

        return readers;
    }

    public static boolean updateReader(String readerId, String newName, String newEmail, String newAge) {
        List<Reader> readers = loadReaders();
        Optional<Reader> readerToUpdate = readers.stream()
                                                 .filter(reader -> reader.getId().equals(readerId))
                                                 .findFirst();

        if (readerToUpdate.isPresent()) {
            Reader reader = readerToUpdate.get();
            reader.setName(newName);  // Update name
            reader.setEmail(newEmail);  // Update email
            reader.setAge(newAge);  // Update age
            saveReaders(readers);  
            System.out.println("Reader updated: " + reader);
            System.out.print("first :" +readers);
            return true;
        } else {
            System.err.println("Reader not found with ID: " + readerId);
            return false;
        }
    }
    
    public static Reader searchReaderById(String readerId) {
        List<Reader> readers = loadReaders();
        return readers.stream()
                      .filter(reader -> reader.getId().equals(readerId))
                      .findFirst()
                      .orElse(null);  // Return null if not found
    }

    public static List<Reader> searchReadersByName(String name) {
        List<Reader> readers = loadReaders();
        return readers.stream()
                      .filter(reader -> reader.getName().toLowerCase().contains(name.toLowerCase()))
                      .collect(Collectors.toList());  // Return a list of readers matching the name
    }
    
    public static void saveReaders(List<Reader> readers) {
        List<String[]> data = new ArrayList<>();

        for (Reader reader : readers) {
            data.add(reader.toCSVRow());
        }

        CSVReaderWriter.writeCSV(FILE_PATH, data);
    }
}

