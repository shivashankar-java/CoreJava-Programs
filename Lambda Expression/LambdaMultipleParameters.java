package Java8features;

import java.util.function.BiFunction;

public class LambdaMultipleParameters {
    public static void main(String[] args) {
       
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        
        BiFunction<Integer, Integer, Integer> add1 = (a, b) -> a + b;

        System.out.println("Sum of 10 and 20 is: " + add.apply(10, 20)); 
        System.out.println("Sum of 30 and 20 is: " + add1.apply(30, 20));
    }
}

