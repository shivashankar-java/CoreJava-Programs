package Rowset;

import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.rowset.Predicate;

public class SalaryFilter implements Predicate {
    private double minSalary;

    public SalaryFilter(double minSalary) {
        this.minSalary = minSalary;
    }
    @Override
    public boolean evaluate(RowSet rs) {
        try {
            double salary = rs.getDouble("salary");
            return salary > minSalary;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public boolean evaluate(Object value, int column) {
        return false;    
        }
    @Override
    public boolean evaluate(Object value, String columnName) {
        return false; 
//        evaluate(Object value, int column) and evaluate(Object value, String columnName) 
//        are not used in this implementation because the filtering logic is based on the RowSet itself,
//        not on specific objects or column names.
    }
}
