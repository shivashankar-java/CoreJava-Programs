package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingExample {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        try {
		            System.out.print("Enter a number: ");
		            int num1 = Integer.parseInt(scanner.nextLine());
		            
		            System.out.print("Enter another number: ");
		            int num2 = Integer.parseInt(scanner.nextLine());
		          
		            int result = num1 / num2;	           
		            System.out.println("The result is: " + result);
		            
		        } catch (ArithmeticException e) {
		            System.out.println("Error: Division by zero is not allowed.");
		            
		        } catch (NumberFormatException e) {
		            System.out.println("Error: Invalid input, please enter an integer.");
		            
		        } catch (Exception e) {
		            System.out.println("Unexpected error: " + e.getMessage());
		            
		        } finally {		            
		            System.out.println("This block always executes, even if an exception occurs.");
		            scanner.close();  
		        }
		    }
		}

	


