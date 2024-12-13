package Inheritance;

public class Employee {
   protected String name;
   protected int id;
   protected int age;
   
   public Employee(String name, int id, int age) {
	  this.name=name;
	  this.id=id;
	  this.age=age;
   }
   
   public void Displaydetails() {
	   System.out.println("Employee Name:" + name);
	   System.out.println("Employee Id:" + id);
	   System.out.println("Employee Age:" + age);
   }
   
   double calculateSalary() {
	   return 50000;
   }
   
class Manager extends Employee{
     private double bonus;
	public Manager(String name, int id, int age,double bonus) {
		super(name, id, age);
		this.bonus=bonus;	
	}
	
	public void Displaydetails() {
		super.Displaydetails();
		System.out.println("role: Manager");
	}
	
	public double calculateSalary() {
		return super.calculateSalary() + bonus;
	}
	
   }     
}
