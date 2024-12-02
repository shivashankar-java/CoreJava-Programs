package AccessModifiersJV0017;

public class AccessModifiersExample {
	
	    // Public variables (accessible anywhere)
	    public int publicInt = 10;
	    public double publicDouble = 20.5;
	    public String publicString = "Public String";
	    public boolean publicBoolean = true;

	    // Private variables (accessible only within this class)
	    private int privateInt = 30;
	    private double privateDouble = 40.5;
	    private String privateString = "Private String";
	    private boolean privateBoolean = false;

	    // Protected variables (accessible within same package and subclasses)
	    protected int protectedInt = 50;
	    protected double protectedDouble = 60.5;
	    protected String protectedString = "Protected String";
	    protected boolean protectedBoolean = true;

	    // Default (package-private) variables (accessible only within same package)
	    int defaultInt = 70;
	    double defaultDouble = 80.5;
	    String defaultString = "Default String";
	    boolean defaultBoolean = false;

	    // Public method (accessible anywhere)
	    public void showPublic() {
	        System.out.println("Public int: " + publicInt);
	        System.out.println("Public double: " + publicDouble);
	        System.out.println("Public String: " + publicString);
	        System.out.println("Public boolean: " + publicBoolean);
	    }

	    // Private method (accessible only within this class)
	    private void showPrivate() {
	        System.out.println("Private int: " + privateInt);
	        System.out.println("Private double: " + privateDouble);
	        System.out.println("Private String: " + privateString);
	        System.out.println("Private boolean: " + privateBoolean);
	    }

	    // Protected method (accessible within same package and subclasses)
	    protected void showProtected() {
	        System.out.println("Protected int: " + protectedInt);
	        System.out.println("Protected double: " + protectedDouble);
	        System.out.println("Protected String: " + protectedString);
	        System.out.println("Protected boolean: " + protectedBoolean);
	    }

	    // Default method (accessible only within same package)
	    void showDefault() {
	        System.out.println("Default int: " + defaultInt);
	        System.out.println("Default double: " + defaultDouble);
	        System.out.println("Default String: " + defaultString);
	        System.out.println("Default boolean: " + defaultBoolean);
	    }

	    // Main method to test access modifiers
	    public static void main(String[] args) {
	        AccessModifiersExample obj = new AccessModifiersExample();
	        
	        System.out.println("Accessing public variables and method:");
	        obj.showPublic();
	      
	        System.out.println("\nAccessing protected variables and method:");
	        obj.showProtected();  

	        System.out.println("\nAccessing default variables and method:");
	        obj.showDefault();  
	    }
	}

	


