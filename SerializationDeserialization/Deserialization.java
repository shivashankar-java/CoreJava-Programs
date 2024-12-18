package SerializationDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("Employee.ser");
	             ObjectInputStream ois = new ObjectInputStream(fis)) {
	           Employee emp = new Employee("Shivashakar",23);
	        		 ois.readObject();
	            System.out.println("Deserialization complete. Object: " + emp);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
