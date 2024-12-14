package Java8features;

import java.util.function.BiFunction;


public class LambdaBlockBody {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = (a, b) -> {
            int result = a + b; 
            return result;       
        };

        System.out.println(add.apply(30, 20)); 
    }
}


