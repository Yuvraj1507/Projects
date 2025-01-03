package database;
import database.DatabaseConnection;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        System.out.println("Testing database connection...");
        
        try (Connection connection = DatabaseConnection.getConnection()) {
            if (connection != null) {
                System.out.println("Database connection successful!");
            } else {
                System.out.println("Failed to establish connection. Connection object is null.");
            }
        } catch (Exception e) {
            System.out.println("Error occurred while testing database connection:");
            e.printStackTrace();
        }
    }
}
