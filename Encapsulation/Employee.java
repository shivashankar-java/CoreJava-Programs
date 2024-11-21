package Encapsulation;

public class Employee {
     private String name;
     private double salary;
     
     public Employee(String name, double salary) {
    	 this.name=name;
    	 this.salary=salary;
     }
     
     
     public String getname() {
    	 return name;	
     }
     
     public double getSalary() {
    	 return salary;
     }
     
     public void setSalary(double salary) {
    	 if (salary >0) {
    		 this.salary=salary;
    	 }
    		 else {
    			 System.out.println("salary must be positive");
    		 }	 
    	 }     
     }

class Manager extends Employee{

	private String department;

	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department =department;
		}
	public String getDepartment() {
		return department;
	}
}


