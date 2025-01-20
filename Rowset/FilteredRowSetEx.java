package Rowset;

import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.Predicate;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class FilteredRowSetEx {
    public static void main(String[] args) {
        try {
            FilteredRowSet frs = RowSetProvider.newFactory().createFilteredRowSet();

            frs.setUrl("jdbc:mysql://localhost:3306/dmantz");
            frs.setUsername("root");
            frs.setPassword("root");
            frs.setCommand("SELECT * FROM employees");
            frs.execute();

            SalaryFilter filter = new SalaryFilter(50000);
            frs.setFilter(filter);

           System.out.println("Filtered Data (Salary > 50000):");
            while (frs.next()) {
                int id = frs.getInt("id");
                String name = frs.getString("name");
                double salary = frs.getDouble("salary");

                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
