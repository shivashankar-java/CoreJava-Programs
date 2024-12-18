package SerializationDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
   public static void main(String[] args) {
	
	   Employee emp = new Employee("Shivashankar",23);
	   
	   try (FileOutputStream fos = new FileOutputStream("Employee.ser");
			   ObjectOutputStream oos=new ObjectOutputStream(fos)){
		   oos.writeObject(emp);
		   
		   System.out.println("Serialization complete" + emp);
	   }catch(Exception e) {
			 e.printStackTrace();
		   }      
      }
}   
