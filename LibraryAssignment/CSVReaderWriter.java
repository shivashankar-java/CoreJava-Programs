package pkg.csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import java.io.*;
import java.util.*;

public class CSVReaderWriter {

    // Read CSV file
    public static List<String[]> readCSV(String filePath) {
        List<String[]> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line.split(",")); 
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return data;
    }

    // Write CSV file
    public static void writeCSV(String filePath, List<String[]> data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String[] row : data) {
                bw.write(String.join(",", row));
                bw.newLine();
            }          
            
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}


