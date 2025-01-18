package Rowset;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetEx {
    public static void main(String[] args) {
        try {
            JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet();

            jrs.setUrl("jdbc:mysql://localhost:3306/dmantz");
            jrs.setUsername("root");
            jrs.setPassword("root");

            jrs.setCommand("SELECT id, name, salary FROM employees");
            jrs.execute();

            while (jrs.next()) {
                System.out.println("ID: " + jrs.getInt("id"));
                System.out.println("Name: " + jrs.getString("name"));
                System.out.println("Salary: " + jrs.getDouble("salary"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


