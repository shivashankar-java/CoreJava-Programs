package Polymorphism;

//Program for final keyword

  class Calc {
  public  void show() {
	 System.out.println("in Calc show");
 }
   public void add(int a,int b) {
	  System.out.println(a+b);
  }
}
 
class Advcalc extends Calc{
	 public void show() {
		 System.out.println("hello");
	 }
}