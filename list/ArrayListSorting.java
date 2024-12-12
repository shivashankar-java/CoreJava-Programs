package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        System.out.println("Original List: " + numbers);

        // Sorting in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted List (Ascending): " + numbers);

        // Sorting in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted List (Descending): " + numbers);
    }
}

