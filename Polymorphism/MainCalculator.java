package Polymorphism;

public class MainCalculator {

	public static void main(String[] args) {
		Calculator cal =new Calculator();
		
		System.out.println("The sum two intergers:" + cal.add(2, 8));
		System.out.println("The sum two doubles:" + cal.add(8, 8));
		System.out.println("The sum three intergers:" + cal.add(7, 8, 3));
	}

}
