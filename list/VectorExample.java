package list;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
 
        Vector<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Inserting an element at a specific index
        vector.add(1, "Orange");

        // Printing the Vector
        System.out.println("Vector: " + vector);

        // Accessing an element by index
        String element = vector.get(2);
        System.out.println("Element at index 2: " + element);

        // Checking if an element exists
        System.out.println("Does Vector contain 'Banana'? " + vector.contains("Banana"));

        // Removing an element
        vector.remove("Banana");

        // Checking if the Vector is empty
        System.out.println("Is Vector empty? " + vector.isEmpty());

        // Printing the updated Vector
        System.out.println("Updated Vector: " + vector);

        // Size of the Vector
        System.out.println("Size of Vector: " + vector.size());

        // Capacity of the Vector
        System.out.println("Capacity of Vector: " + vector.capacity());
    }
} 
