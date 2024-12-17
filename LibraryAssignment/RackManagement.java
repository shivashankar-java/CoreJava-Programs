package pkg.LibraryAssignment;

import java.util.*;

public class RackManagement {
    private static final String FILE_PATH = "E:\\Dmantz\\readRack.csv";

    public static List<Rack> loadRacks() {
        List<Rack> racks = new ArrayList<>();
        List<String[]> data = CSVReaderWriter.readCSV(FILE_PATH);

        for (String[] row : data) {
            if (row.length < 2) {
                System.err.println("Invalid row: " + String.join(",", row));
                continue;
            }

            String id = row[0];
            String location = row[1];

            racks.add(new Rack(id, location));
        }

        return racks;
    }

    public static void saveRacks(List<Rack> racks) {
        List<String[]> data = new ArrayList<>();
        for (Rack rack : racks) {
            data.add(rack.toCSVRow());
        }
        CSVReaderWriter.writeCSV(FILE_PATH, data);
    }
}

