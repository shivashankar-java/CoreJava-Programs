package Inheritance;

public class MainEmployee {

	public static void main(String[] args) {

		Employee employee = new Employee("Joy Root",25,101);
//        Manager manager = new Manager("Joy Smith", 102,35, 10000);

        System.out.println("Employee Details:");
        employee.Displaydetails();
        System.out.println("Salary: $" + employee.calculateSalary());

//        System.out.println("\nManager Details:");
//        manager.displayDetails();
//        System.out.println("Salary: $" + manager.calculateSalary());
		
	

	}

}
