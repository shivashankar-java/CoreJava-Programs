package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("New York"); // Duplicate, won't be added

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet: " + cities);

        // Remove an element
        cities.remove("Los Angeles");
        System.out.println("After removing Los Angeles: " + cities);

        // Check if an element exists
        System.out.println("Contains Chicago? " + cities.contains("Chicago"));

        // Iterate through the LinkedHashSet
        System.out.println("Iterating through the LinkedHashSet:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}

