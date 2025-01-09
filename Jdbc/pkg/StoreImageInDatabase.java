package Jdbc.pkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StoreImageInDatabase {
    public static void main(String[] args) throws IOException {
        String jdbcURL = "jdbc:mysql://localhost:3306/vcube"; 
        String username = "root"; 
        String password = "root";
        String image_Path = "C:\\Users\\Shivashankar\\OneDrive\\Desktop\\image\\Java_logo.png";     
        String sql="insert into image(image_data) values(?)";
        
       try {
    	   Class.forName("com.mysql.cj.jdbc.Driver");
    	   }catch(ClassNotFoundException e){
    		   System.out.println(e.getMessage());
    	   }
       
       try {
    	   Connection conn = DriverManager.getConnection(jdbcURL, username, password);
    	   System.out.println("Connection done");
    	   
    	   FileInputStream fis = new FileInputStream(image_Path);
    	   byte[] image_data = new byte[fis.available()];
    	   fis.read(image_data);
    	   
    	   PreparedStatement ps =conn.prepareStatement(sql);
    	   ps.setBytes(1, image_data);   	   
    	   int affectedrows =ps.executeUpdate();
    	   
    	   if(affectedrows>0) {
    		   System.out.println("Image inserted Succesfully....!");
    	   }else {
    		   System.out.println("Image not inserted....");
    	   }
    	   
    	   
       }catch(SQLException e) {
    	   System.out.println(e.getMessage());
       }    
    }
}

