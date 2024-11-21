package Encapsulation;

public class MarutiSuzuki {
  private double fuellevel;
  private boolean engineon;
  
//  constructor for initial level
  public MarutiSuzuki (double initialFuel) {
	if (initialFuel>=0) {
		  this.fuellevel=initialFuel;
	  } else {
		  this.fuellevel =0;
	  }
	  this.engineon=false;  
  }
    
  public double Fuellevel() {
	  return fuellevel;
  }
  
//  method for refuel
  public void refuel(double amount) {
	  if(amount>0) {
		  fuellevel+=amount;
		   }
	  else {
		  System.out.println("Refuel must be positive");
	  }
  }
  
//  method for startEngine
  public void startEngine() {
      if (fuellevel > 0) {
          engineon = true;
          System.out.println("Engine started.....");
      } else {
          System.out.println("Not enough fuel to start the engine.");
      }
  }
  
//method for stopEngine
  public void stopEngine() {
	  engineon=false;
	  System.out.println("Engine stopped.....");
  }
  
//   method for drive
  public void drive(double distance) {
	  if (engineon) {
		  double fuelconsumed= distance * 0.1;
		    if(fuellevel>= fuelconsumed) {
		       (fuellevel)-= fuelconsumed;
		       System.out.println("Driving for" + distance +"km");
		    }
		    else {
		    	System.out.println("Not enough fuel to drive that distance....");
		    }
	  } else {
		    	System.out.println("start the Engine first...");
		    }
	  }
  
//	  method for Display status
	  public void Displaystatus( ) {
		  System.out.println("Fuellevel:" + fuellevel +"Liters"); 
		  System.out.println("Engine on :" + (engineon ? "yes" : "No"));
	  } 
  }
  
  

