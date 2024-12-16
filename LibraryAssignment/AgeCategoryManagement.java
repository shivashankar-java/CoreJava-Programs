package pkg.csv;

import java.util.*;

public class AgeCategoryManagement {
    private static final String FILE_PATH = "E:\\Dmantz\\ReadAgeCategory.csv";

    public static List<AgeCategory> loadAgeCategories() { 
        List<AgeCategory> ageCategories = new ArrayList<>();
        List<String[]> data = CSVReaderWriter.readCSV("FILE PATH");

        for (String[] row : data) {
            if (row.length < 2) {
                System.err.println("Invalid row: " + String.join(",", row));
                continue;
            }

            String id = row[0];
            String categoryName = row[1];

            ageCategories.add(new AgeCategory(id, categoryName));
        }

        return ageCategories;
    }

    public static void saveAgeCategories(List<AgeCategory> ageCategories) {
        List<String[]> data = new ArrayList<>();
        for (AgeCategory ageCategory : ageCategories) {
            data.add(ageCategory.toCSVRow());
        }
        CSVReaderWriter.writeCSV("FILE PATH", data);
    }
}

