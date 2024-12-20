package services;

import models.Pizza;
import database.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class pizzaservice {

    // Fetch all pizzas from the database
    public List<Pizza> getAllPizzas() {
        List<Pizza> pizzas = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM pizzas";  // SQL to get all pizzas
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();

                // Loop through the result set and add pizzas to the list
                while (rs.next()) {
                    int pizzaId = rs.getInt("pizza_id");
                    String name = rs.getString("name");
                    double price = rs.getDouble("price");
                    pizzas.add(new Pizza(pizzaId, name, price));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pizzas;
    }

    // Fetch pizza by ID from the database
    public Pizza getPizzaById(int pizzaId) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM pizzas WHERE pizza_id = ?";  // SQL to get pizza by ID
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setInt(1, pizzaId); // Set the pizza ID parameter in the query
                ResultSet rs = ps.executeQuery();

                // If pizza exists, return the pizza object
                if (rs.next()) {
                    String name = rs.getString("name");
                    double price = rs.getDouble("price");
                    return new Pizza(pizzaId, name, price);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;  // Return null if pizza not found
    }
}
