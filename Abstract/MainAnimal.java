package Abstract;

public class MainAnimal {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Animal dog = new Dog();
        Animal cat = new Cat();

     dog.sleep();
     dog.sound();
     
     cat.sleep();
     cat.sound();
    }
}
