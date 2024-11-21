package Polymorphism;

//program for method overriding

 class Animal {
     public void sound() {
    	 System.out.println( "Animal makes sound");
     } 
}
 
 class Dog extends Animal{
	 public void sound() {
		 System.out.println("Dog makes sound");
	 }
 }
 
class Cat extends Animal{
	public void sound() {
		System.out.println("cat makes meow");
	}
}

class Cow extends Animal{
	public void sound() {
		System.out.println("Cow makes sound");
	}
}
