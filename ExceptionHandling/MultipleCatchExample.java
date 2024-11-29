package ExceptionHandling;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw different exceptions
            String str = null;
            System.out.println(str.length()); // NullPointerException

            int[] arr = new int[2];
            System.out.println(arr[5]); 
           
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
