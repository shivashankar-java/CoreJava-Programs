package Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate element, won't be added

        // Print the HashSet
        System.out.println("HashSet: " + fruits);

        // Check if an element exists
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // Remove an element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Iterate over the HashSet
        System.out.println("Iterating through the HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

