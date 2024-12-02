package ExceptionHandling;

public class Demo {

	public static void main(String[] args) {
		
		int i=2;
		int j=2;
		
		try {
		  j=10/i;
		}
		catch(Exception e) {
			System.out.println("something went wrong");
		}
		
		 System.out.println(i);
		 System.out.println("Hello");

	}

}
