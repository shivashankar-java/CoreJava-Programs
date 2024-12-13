package Inheritance;

public class Animal {
  String name;
  
  public Animal(String name) {
	  this.name =name;
  }
  
  public void eat() {
	  System.out.println(name +" is eating..");
  }
}

class mammal extends Animal{

	public mammal(String name) {
		super(name);
		
	}
	public void walk() {
		System.out.println(name + " is speaking..");
	}	
}

class Dog extends mammal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barks..");
    }
}