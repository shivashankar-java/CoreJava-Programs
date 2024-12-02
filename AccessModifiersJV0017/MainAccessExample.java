package AccessModifiersJV0017;

public class MainAccessExample {
		
		    public static void main(String[] args) {
		        AccessModifiersExample obj = new AccessModifiersExample();

		        System.out.println("\nAccessing public variables and method:");
		        System.out.println("Public int: " + obj.publicInt);
		        System.out.println("Public double: " + obj.publicDouble);
		        System.out.println("Public String: " + obj.publicString);
		        
		        System.out.println("\nPublic boolean: " + obj.publicBoolean);
		        obj.showPublic();  

		        System.out.println("\nAccessing protected variables and method:");
		        obj.showProtected();  

		        System.out.println("\nAccessing default variables and method:");
		        obj.showDefault();  

		    }
		}

