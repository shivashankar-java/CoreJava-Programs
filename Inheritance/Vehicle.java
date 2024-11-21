package Inheritance;

public class Vehicle {
	// Base class
	    protected String make;
	    protected String model;
	    protected int year;

	    public Vehicle(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	    public void displayDetails() {
	        System.out.println("Make: " + make);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	    }

	    public void start() {
	        System.out.println("Vehicle is starting...");
	    }
	}

	// child class1 - Car
	class Car extends Vehicle {
	    private int doors;

	    public Car(String make, String model, int year, int doors) {
	        super(make, model, year);
	        this.doors = doors;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();  // Display vehicle details
	        System.out.println("Doors: " + doors);
	    }

	    @Override
	    public void start() {
	        super.start();
	        System.out.println("The car engine is now running.");
	    }
	}

	// child class - Bike
	class Bike extends Vehicle {
	    private boolean hasCarrier;

	    public Bike(String make, String model, int year, boolean hasCarrier) {
	        super(make, model, year);
	        this.hasCarrier = hasCarrier;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Has Carrier: " + hasCarrier);
	    }

	    @Override
	    public void start() {
	        super.start();
	        System.out.println("The bike engine is now running.");
	    }
	}

	// child class - Truck
	class Truck extends Vehicle {
	    private int payloadCapacity;

	    public Truck(String make, String model, int year, int payloadCapacity) {
	        super(make, model, year);
	        this.payloadCapacity = payloadCapacity;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Payload Capacity: " + payloadCapacity + " kg");
	    }

	    @Override
	    public void start() {
	        super.start();
	        System.out.println("The truck engine is now running.");
	    }
	}




