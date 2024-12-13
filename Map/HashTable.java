package Map;

import java.util.*;

public class HashTable {
    public static void main(String[] args) {
       
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(2, "Apple");

        System.out.println("Value for key 2: " + hashtable.get(2));

        if (hashtable.containsKey(3)) {
            System.out.println("Key 3 exists.");
        }

        if (hashtable.containsValue("Banana")) {
            System.out.println("Value Banana exists.");
        }

        hashtable.remove(1);
        System.out.println("After removing key 1: " + hashtable);

        System.out.println("Size of hashtable: " + hashtable.size());
    }
}

