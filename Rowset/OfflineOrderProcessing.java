package Rowset;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class OfflineOrderProcessing {
    public static void main(String[] args) {
        try {
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            
            crs.setUrl("jdbc:mysql://localhost:3306/jdbc");
            crs.setUsername("root");
            crs.setPassword("root");
            crs.setCommand("SELECT order_id, customer_name, order_date, order_status FROM orders");
            crs.execute();

            while (crs.next()) {
                int orderId = crs.getInt("order_id");
                String customerName = crs.getString("customer_name");
                String orderDate = crs.getString("order_date");
                String orderStatus = crs.getString("order_status");

                if ("Pending".equals(orderStatus)) {
                	crs.updateString("order_status", "Processed");
                	crs.updateRow();
                    System.out.println("Order ID: " + orderId + " has been processed.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

