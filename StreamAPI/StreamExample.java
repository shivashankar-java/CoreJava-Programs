package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
     
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        List<Integer> result = numbers.stream()  // Create a stream from the list
                                      .filter(n -> n % 2 == 0)  // Filter even numbers
                                      .map(n -> n * n)          // Square each number
                                      .collect(Collectors.toList());  // Collect result as a list

        System.out.println(result);  // Output: [4, 16, 36, 64, 100]
    }
}

