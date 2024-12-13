package Map;

import java.util.*;

public class LinkedHashmap {
    public static void main(String[] args) {
    
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Apple", 15);
        map.put("Banana", 25);
        map.put("Cherry", 35);

        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }
    }
}

