package Polymorphism;

//program for method overriding

 class Shape {
  public void Draw() {
	  System.out.println("Drawing a Shape");
  }
 }
 
 class Circle extends Shape{
	 public void Draw() {
		 System.out.println("Drawing a circle");
	 }
 }
 
class Rectangle extends Shape{
	public void Draw() {
		System.out.println("Drawing a Rectangle");
	}
}
