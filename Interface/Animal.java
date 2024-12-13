package Interface;

 interface Animal {
	 
  void sound();
 
  void eat();
  }
 
class Dog implements Animal {
	public void sound() {
		System.out.println("Woof..");
	}

   public void eat() {
	   System.out.println("Eating..");
   }
}

class Cat implements Animal{
	public void sound() {
		System.out.println("Meow....");
	}

	@Override
	public void eat() {
		 System.out.println("Eating..");
	}
}