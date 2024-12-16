package Constructors;

class Car {
    String model;
    int year;

    // Parameterized constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }
}




	

