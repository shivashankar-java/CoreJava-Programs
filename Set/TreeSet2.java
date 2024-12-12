package Set;

import java.util.TreeSet;
import java.util.Comparator;

public class TreeSet2 {
    public static void main(String[] args) {
        // Custom comparator to sort in descending order
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());

        // Adding elements
        treeSet.add(8);
        treeSet.add(15);
        treeSet.add(3);
        treeSet.add(7);

        // Display elements
        System.out.println("TreeSet in descending order: " + treeSet); 
    }
}

