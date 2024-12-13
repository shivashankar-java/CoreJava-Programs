package Abstract;

abstract class Person {
    String name;
 
    abstract void displayDetails();

	public Person(String name) {
		super();
		this.name = name;
	}
}

class Student extends Person {
    int rollNumber;
    
    Student(String name, int rollNumber) {
        super(name); 
        this.rollNumber = rollNumber;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    String subject;
    
    Teacher(String name, String subject) {
        super(name); 
        this.subject = subject;
    }

    void displayDetails() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
