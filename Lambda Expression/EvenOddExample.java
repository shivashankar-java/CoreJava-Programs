package Java8features;

import java.util.function.Predicate;

public class EvenOddExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> {
            if(n % 2==0){
            	return true;
            } else {
            	return false;
            }
        };

        System.out.println("Is 12 even? " + isEven.test(12));  
        System.out.println("Is 15 even? " + isEven.test(15));  
    }
}

