package StreamAPI;

import java.util.*;
import java.util.stream.*;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amulya", "Bob", "Chum", "David", "Anna", "Ashu");

        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A")) 
                                          .collect(Collectors.toList());

        filteredNames.forEach(System.out::println);
    }
}

