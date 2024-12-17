package StaticDefault;

interface Calculator {
   
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}

public class MainCalculator {
    public static void main(String[] args) {
       
        int sum = Calculator.add(20, 30);
        int difference = Calculator.subtract(20, 10);
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}

