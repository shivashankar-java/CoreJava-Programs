package Encapsulation;

public class EncapusulationExample {
   public static void main(String[] args) {
		 
	Manager manager = new Manager("Shivashankar",30000, "IT Dept");
        System.out.println("Manager: " + manager.getname());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Department: " + manager.getDepartment());
	}

}
