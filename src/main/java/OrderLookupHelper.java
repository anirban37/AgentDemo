package com.enterprise.mulesoft.custom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OrderLookupHelper {

    // Hardcoded credentials — should trigger a secrets/security rule
    private static final String DB_URL = "jdbc:mysql://prod-db.internal:3306/orders";
    private static final String DB_USER = "admin";
    private static final String DB_PASSWORD = "P@ssw0rd123";

    // No Javadoc, no access modifier convention comment — should trigger documentation rule
    public String getOrderStatus(String orderId) {
        String status = null;
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement();

            // Direct string concatenation — SQL injection risk, should trigger a security rule
            String query = "SELECT status FROM orders WHERE order_id = '" + orderId + "'";
            var rs = stmt.executeQuery(query);

            if (rs.next()) {
                status = rs.getString("status");
            }

            // Connection/Statement never closed — resource leak, should trigger a rule
        } catch (Exception e) {
            // Empty catch block swallowing exception — should trigger error-handling rule
        }
        return status;
    }

    public static void main(String[] args) {
        OrderLookupHelper helper = new OrderLookupHelper();
        System.out.println(helper.getOrderStatus("12345"));
    }
}
