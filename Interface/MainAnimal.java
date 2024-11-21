package Interface;

public class MainAnimal {

	    public static void main(String[] args) {
	        // Create objects of Dog and Cat
	        Animal dog = new Dog();
	        Animal cat = new Cat();

	        dog.sound();
	        dog.eat();

	        cat.sound();
	        cat.eat();
	    }
	}

