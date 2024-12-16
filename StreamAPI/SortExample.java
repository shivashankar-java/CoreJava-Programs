package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {
    public static void main(String[] args) {
       
        List<Integer> numbers = Arrays.asList(9, 1, 8, 2, 7, 3, 6, 4, 5);

        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()  
                                             .collect(Collectors.toList());

        System.out.println(sortedNumbers); 
    }
}
