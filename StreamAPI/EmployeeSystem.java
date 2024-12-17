package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSystem {

	

	public static void main(String[] args) {
		List<Employee> employees =Arrays.asList(new Employee("Shiva",23,"Engineering",78000),
				new Employee("Ashu", 28, "Engineering", 60000),
	            new Employee("Ramu", 34, "Marketing", 55000),
	            new Employee("Rakesh", 25, "Sales", 65000),
	            new Employee("David", 40, "Engineering", 70000),
	            new Employee("Shiva", 29, "HR", 50000),
	            new Employee("Mahesh", 43, "Marketing", 60000),
	            new Employee("Chandhu", 35, "HR", 52000),	
	            new Employee("Srinu", 48, "Marketing", 28000)
				);
		
		System.out.println("print Employees older than 30 ");
		employees.stream()
		         .filter(e -> e.getAge()<30)
		         .forEach(System.out::println);
		
		System.out.println("print employees Greaterthan 30");
		employees.stream()
		         .filter(e -> e.getAge()>30)
		         .forEach(System.out::println);
		
		System.out.println("filter by HR");
		employees.stream()
		        .filter(e ->"HR".equals(e.getDepartment()))
		        .forEach(System.out::println);
		
		System.out.println("filter by Engineering");
		employees.stream()
		        .filter(e ->"Engineering".equals(e.getDepartment()))
		        .forEach(System.out::println);
		
		System.out.println("Filter by above <40000salary ");
		employees.stream()
		        .filter(e -> e.getSalary()<40000)
		        .forEach(System.out::println);
		
		System.out.println("Employees sorted in (Ascending)");
		employees.stream()
                 .sorted(Comparator.comparingDouble(e ->e.getSalary()))
                 .forEach(System.out::println);
		System.out.println();
		        
		List<String>employeenames =	employees.stream()
             .map(Employee::getName)
             .distinct()
             .collect(Collectors.toList());
		System.out.println("List of employess"+employeenames);
             
				
	}
}
