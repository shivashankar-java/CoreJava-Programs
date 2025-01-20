package Rowset;

import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JoinrowsetEx {

	public static void main(String[] args) {

		try {
			 RowSetFactory rsf = RowSetProvider.newFactory();
	         CachedRowSet crs1 = rsf.createCachedRowSet();
	         CachedRowSet crs2 = rsf.createCachedRowSet();
          
            crs1.setUrl("jdbc:mysql://localhost:3306/jdbc"); 
            crs1.setUsername("root");                      
            crs1.setPassword("root");                 
            crs1.setCommand("SELECT * FROM employee WHERE department_id ");            
            crs1.execute();                                         

            crs2.setUrl("jdbc:mysql://localhost:3306/jdbc"); 
            crs2.setUsername("root");                      
            crs2.setPassword("root");                 
            crs2.setCommand("SELECT * FROM departments WHERE department_id ");            
            crs2.execute();
            
           JoinRowSet jrs = RowSetProvider.newFactory().createJoinRowSet();

            crs1.setMatchColumn("department_id");
            crs2.setMatchColumn("department_id");
            
            jrs.addRowSet(crs1);
            jrs.addRowSet(crs2);

            System.out.println("Joined Data:");
            while (jrs.next()) {
                int employeeId = jrs.getInt("employee_id");
                String employeeName = jrs.getString("employee_name");
                String departmentName = jrs.getString("department_name");

        System.out.println("Employee ID: " + employeeId +", Employee Name: " 
              + employeeName +", Department: " + departmentName);
               }           
            } catch (SQLException e) {
                e.printStackTrace();
         }           		
	}
}
