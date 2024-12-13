package Inheritance;

public class MainVehicle {
	
	    public static void main(String[] args) {
	        Vehicle car = new Car("Toyota", "Maruthi", 2010, 4);
	        Vehicle bike = new Bike("BMW", "FZ", 2021, true);
	        Vehicle truck = new Truck("Benz", "FH", 2022, 15000);

	        System.out.println("Car Details:");
	        car.displayDetails();
	        car.start();

	        System.out.println("Bike Details:");
	        bike.displayDetails();
	        bike.start();

	        System.out.println("Truck Details:");
	        truck.displayDetails();
	        truck.start();
	    }
	}

