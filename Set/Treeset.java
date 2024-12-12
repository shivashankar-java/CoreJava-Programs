package Set;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        System.out.println("Original TreeSet: " + treeSet);

        // HeadSet: Get elements less than a given value
        System.out.println("HeadSet (less than 30): " + treeSet.headSet(30)); 

        // TailSet: Get elements greater than or equal to a given value
        System.out.println("TailSet (greater than or equal to 30): " + treeSet.tailSet(30)); 

        // SubSet: Get elements within a specific range
        System.out.println("SubSet (20 inclusive to 40 exclusive): " + treeSet.subSet(20, 40)); 

        // SubSet with both bounds inclusive
        System.out.println("SubSet (20 inclusive to 40 inclusive): " + treeSet.subSet(20, true, 40, true)); 
       
        System.out.println("First Element: " + treeSet.first()); 
        System.out.println("Last Element: " + treeSet.last());   

        // Ceiling: Smallest element greater than or equal to 25
        System.out.println("Ceiling (≥ 25): " + treeSet.ceiling(25)); 

        treeSet.lower(20);
        treeSet.higher(40);
        treeSet.floor(30);
        
        System.out.println(treeSet.lower(20));
        System.out.println(treeSet.higher(30));
        System.out.println(treeSet.floor(30));
    }
}

