package Abstract;

public class MainPerson {
    public static void main(String[] args) {
        Person student = new Student("Shiva", 101);
        student.displayDetails();
        
        System.out.println();

        Person teacher = new Teacher("Mr. Smith", "Math");
        teacher.displayDetails();
    }
}

