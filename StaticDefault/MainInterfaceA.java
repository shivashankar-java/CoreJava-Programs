package StaticDefault;

interface InterfaceA {
    
    default void display() {
        System.out.println("Displaying from InterfaceA");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("Displaying from InterfaceB");
    }
}

class Combined implements InterfaceA, InterfaceB {
    @Override
    public void display() {
        System.out.println("Displaying from Combined class ");
    }
}

public class MainInterfaceA {
    public static void main(String[] args) {
        Combined combined = new Combined();
        combined.display(); 
    }
}

