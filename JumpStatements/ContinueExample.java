package JumpStatements;

public class ContinueExample {

	    public static void main(String[] args) {
	       
	        for (int i = 1; i <= 108; i++) {
	            if (i % 3 == 0) {
	                continue;  // Skip this iteration if i is a multiple of 3
	            }
	            System.out.println(i);
	        }
	    }
	}


