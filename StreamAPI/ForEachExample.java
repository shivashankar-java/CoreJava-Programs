package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
       
        List<String> names = Arrays.asList("John", "Paul", "George", "Ringo");

        names.stream().forEach(name -> System.out.println(name));
    }
}

