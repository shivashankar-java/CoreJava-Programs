package StaticDefault;

interface Printer {
    default void printMessage(String message) {
        System.out.println("Printing message: " + message);
    }
    
    static void printStaticMessage() {
        System.out.println("This is a static message from Printer.");
    }
}

class Document implements Printer {
   
}

public class MainDefault {
    public static void main(String[] args) {
        
        Document doc = new Document();
       doc.printMessage("helllo java from defualt method");  
        
       Printer.printStaticMessage();
    }
}

