package list;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		
		list.add("Apple");
		list.add("banana");
		list.add("cheerys");
		list.add("Graphs");
		
		System.out.println("Initial list : " + list);
		
		// Accessing elements
		String fruit=list.get(2);
		System.out.println("Element of index 2 :" + fruit);
		
		// Updating elements
        list.set(1, "Blueberry");
        System.out.println("After update: " + list);
        
     // Removing elements
//        list.remove(1);
//        System.out.println("After removal: " + list);
        
     // Checking size
        System.out.println("Size of the list: " + list.size());
        
     // Add, remove, and update elements
//        list.add("Mango");
//        list.remove("Banana");
//        list.set(1, "Orange");
       
       for(String fruits : list) {
    	   System.out.println(fruits);
       }
	}

}
