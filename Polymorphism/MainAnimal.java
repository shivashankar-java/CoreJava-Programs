package Polymorphism;

public class MainAnimal {

	public static void main(String[] args) {
		Animal myanimal = new Animal();
		
		Animal mydog = new Dog();
		Animal mycat = new Cat();
		Animal mycow = new Cow(); 
		
		myanimal.sound();
		mydog.sound();
		mycat.sound();
		mycow.sound();
		
		}
      }


