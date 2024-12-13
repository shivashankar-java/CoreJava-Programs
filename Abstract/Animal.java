package Abstract;

public abstract class Animal {
	 public abstract void sound();
	 
	 public void sleep() {
		 System.out.println("The Animal is sleeping");
		 }
	 }

 class Dog extends Animal{
		public void sound() {
			System.out.println("The dog is braking");
		}
	}

	// Concrete class (extends Animal)
class Cat extends Animal {
	    // Providing implementation for the abstract method 'sound'
	  
	    public void sound() {
	        System.out.println("Cat meows");
	    }
	}

	

	

