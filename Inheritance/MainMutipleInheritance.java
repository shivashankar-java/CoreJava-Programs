package Inheritance;

interface A {
  void methodA();  
}

//Interface B
interface B {
  void methodB();  
 
 default void defaultMethodB() {
     System.out.println("Default method in Interface B");
  }
}

interface C {
 
 default void defaultMethodC() {
     System.out.println("Default method in Interface C");
 }
}

class D implements A, B, C {

 public void methodA() {
     System.out.println("Implemented methodA from Interface A");
 }

 public void methodB() {
     System.out.println("Implemented methodB from Interface B");
 }

 @Override
 public void defaultMethodC() {
     System.out.println("Overridden defaultMethodC in class D");
 }
}

public class MainMutipleInheritance {
 public static void main(String[] args) {
     D obj = new D();
     obj.methodA();  // Implemented in class D
     obj.methodB();  // Implemented in class D
     obj.defaultMethodB();  // Default from Interface B
     obj.defaultMethodC();  // Overridden in class D
 }
}

