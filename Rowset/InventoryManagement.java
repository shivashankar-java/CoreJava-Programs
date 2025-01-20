package Rowset;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class InventoryManagement {
    public static void main(String[] args) {
        try {
            JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();

            rs.setUrl("jdbc:mysql://localhost:3306/jdbc");
            rs.setUsername("root");
            rs.setPassword("root");

            rs.setCommand("SELECT product_id, product_name, quantity, price FROM products");
            rs.execute();

            while (rs.next()) {
                int productId = rs.getInt("product_id");
                String productName = rs.getString("product_name");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");

                if (quantity < 10) {
                	rs.updateInt("quantity", 100); 
                	rs.updateRow(); 
                    System.out.println("Restocked " + productName + " to 100 units.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

