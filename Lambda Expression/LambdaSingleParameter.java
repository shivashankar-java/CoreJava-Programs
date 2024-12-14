package Java8features;

import java.util.function.Function;

public class LambdaSingleParameter {
    public static void main(String[] args) {
       
        Function <Integer,Integer> square= (x) -> x*x;
        System.out.println("Square of 5 is: " + square.apply(5));   

        Function<Integer, Integer> squareShort = x -> x * x;
        System.out.println("Square of 8 is: " +squareShort.apply(8));  
    }
}

