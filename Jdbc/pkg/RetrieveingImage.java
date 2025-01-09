package Jdbc.pkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveingImage {

	public static void main(String[] args) throws IOException {

		String jdbcURL = "jdbc:mysql://localhost:3306/vcube"; 
        String username = "root"; 
        String password = "root";
        String folder_path = "C:\\Users\\Shivashankar\\OneDrive\\Desktop\\photos\\";     
        String sql="select image_data from image where image_id=(?)";
        
       try {
    	   Class.forName("com.mysql.cj.jdbc.Driver");
    	   }catch(ClassNotFoundException e){
    		   System.out.println(e.getMessage());
    	   }
       
       try {
    	   Connection conn = DriverManager.getConnection(jdbcURL, username, password);
    	   System.out.println("Connection done");
    	   
    	   PreparedStatement ps =conn.prepareStatement(sql);
    	   ps.setInt(1, 1);
    	   ResultSet rs=ps.executeQuery();
    	   
    	   
    	   if(rs.next()) {
    		   byte[] image_data =rs.getBytes("image_data");
    		   String image_path = folder_path +"Extracted image.png";
    		   FileOutputStream os= new FileOutputStream(image_path);
    		   os.write(image_data);
    		   
    	   }else {
    		   System.out.println("Image not found....");
    	   }
    	   
    	   
       }catch(SQLException e) {
    	   System.out.println(e.getMessage());
       }    
	}

}
