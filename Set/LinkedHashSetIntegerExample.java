package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetIntegerExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of integers
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        // Add integers to the LinkedHashSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Duplicate, won't be added

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet: " + numbers);

        // Find the size of the LinkedHashSet
        System.out.println("Size of the LinkedHashSet: " + numbers.size());

        // Check if a number exists
        System.out.println("Contains 30? " + numbers.contains(30));

        // Remove all elements
        numbers.clear();
        System.out.println("Is LinkedHashSet empty? " + numbers.isEmpty());
    }
}

