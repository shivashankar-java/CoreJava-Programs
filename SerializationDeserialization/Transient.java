package SerializationDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Transient {

	public static void main(String[] args) {
         User user = new User("Userid","password");
         
         String filePath = "user.ser";

         try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
             out.writeObject(user);
         } catch (IOException e) {
             e.printStackTrace();
         }
         
         try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
             User deserializedUser = (User) in.readObject();
             System.out.println("Username: " + deserializedUser.userid);
             System.out.println("Password: " + deserializedUser.password); 
         } catch (IOException | ClassNotFoundException e) {
             e.printStackTrace();
         }
         
	}

}
