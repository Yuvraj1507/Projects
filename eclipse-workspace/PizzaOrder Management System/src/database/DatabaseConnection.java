package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Replace these values with your MySQL database details
    private static final String URL = "jdbc:mysql://localhost:3306/mypizzadb";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    // This method returns a Connection object for connecting to the database
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
