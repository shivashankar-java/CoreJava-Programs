package Map;

import java.util.HashMap;

public class Hashmap {
	
    public static void main(String[] args) {
     
    	HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("Value for key 2: " + map.get(2));

        if (map.containsKey(3)) {
            System.out.println("Key 3 exists.");
        }

        if (map.containsValue("Banana")) {
            System.out.println("Value Banana exists.");
        }

        map.remove(1);
        map.size();
        System.out.println("After removing key 1: " + map);

        System.out.println( map.size());
    }
}
