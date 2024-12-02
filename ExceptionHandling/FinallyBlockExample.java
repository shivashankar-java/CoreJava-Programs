package ExceptionHandling;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            String str = "Hello";
            System.out.println(str.charAt(10)); // StringIndexOutOfBoundsException
            
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index out of bounds.");
            
        } finally {
            // Cleanup code always runs
            System.out.println("This block always executes.");
        }
    }
}

