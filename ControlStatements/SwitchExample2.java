package ControlStatements;

public class SwitchExample2 {
   public static void main (String args[]) {
	   
		       char grade='C';

		        switch (grade) {
		            case 'A':
		                System.out.println("Excellent");
		                break;
		            case 'B':
		            	System.out.println("Good");
		            	break;
		            	
		            case 'C':
		                System.out.println("Average");
		                break;
		            case 'D':
		                System.out.println("Below Average");
		                break;
		            case 'F':
		                System.out.println("Fail");
		                break;
		            default:
		                System.out.println("Invalid Grade");
		        }
		    }   
   }

