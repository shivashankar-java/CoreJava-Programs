package Set;

import java.util.HashSet;

public class HashSetIntegerExample {
    public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> numbers = new HashSet<>();

        // Add integers to the HashSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Duplicate element, won't be added

        // Print the HashSet
        System.out.println("Numbers: " + numbers);

        // Check if a number exists
        System.out.println("Contains 20? " + numbers.contains(20));

        // Find the size of the HashSet
        System.out.println("Size of the HashSet: " + numbers.size());

        // Remove an element
        numbers.remove(10);
        System.out.println("After removing 10: " + numbers);

        // Clear the HashSet
        numbers.clear();
        System.out.println("Is HashSet empty? " + numbers.isEmpty());
    }
}

