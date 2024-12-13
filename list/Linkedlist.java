package list;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Java");
        list.add("Python");
        list.add("DSA");
        list.add("HTML");
        list.add("C++");

        // Add element at specific index
        list.add(1, "JavaScript");

        // Remove an element
        list.remove(4);

        // Access elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        // Iterate through the list
        System.out.println("Iterating through LinkedList:");
        for (String language : list) {
            System.out.println(language);
        }
    }
}

