package StaticDefault;

 interface MyInterface {

	default void show() {
		System.out.println("printing show method");
	}

 
	 static void staticmethod() {
		 System.out.println("printng static method");
	 }
}
 
 class Myclass implements MyInterface{
//	 public void show() {
//		 System.out.println("hello form class");
//	 }
 }
 

	
	
 

  