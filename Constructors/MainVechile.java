package Constructors;

class Vehicle {
    String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle brand: " + brand);
    }
}

class Bike extends Vehicle {
    String model;
    
    public Bike(String brand, String model) {
        super(brand);  
        this.model = model;
        System.out.println("Car model: " + model);
    }
}

public class MainVechile {
    public static void main(String[] args) {
      
        Bike bike = new Bike("Tesla", "Model S");
    }
}

