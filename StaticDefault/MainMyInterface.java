package StaticDefault;

public class MainMyInterface implements MyInterface{
    public static void main(String[] args) {
    	Myclass myclass =new Myclass();
    	
    	myclass.show();
    	
    	MyInterface.staticmethod();
    }
 
}
