package Inheritance;

 interface Engine {
   void startEngine();  
   void stopEngine();   
}

 interface Fuel {
   void refuel();  
   void checkFuelLevel();  
}

class FlyingCar implements Engine, Fuel{
 
 @Override
 public void startEngine() {
     System.out.println("Starting the engine of the flying car.");
 }

 @Override
 public void stopEngine() {
     System.out.println("Stopping the engine of the flying car.");
 }

 @Override
 public void refuel() {
     System.out.println("Refueling the flying car.");
 }

 @Override
 public void checkFuelLevel() {
     System.out.println("Checking the fuel level of the flying car.");
  }
}



