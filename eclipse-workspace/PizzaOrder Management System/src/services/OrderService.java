package services;

import models.Order;
import models.Pizza;
import database.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderService {
	public boolean addOrder(Order order) {
	    try (Connection connection = DatabaseConnection.getConnection()) {
	        String sql = "INSERT INTO orders (user_id, pizza_id, quantity, total_price) VALUES (?, ?, ?, ?)";
	        try (PreparedStatement ps = connection.prepareStatement(sql)) {
	            ps.setInt(1, order.getUserId());
	            ps.setInt(2, order.getPizza().getPizzaId());
	            ps.setInt(3, order.getQuantity());
	            ps.setDouble(4, order.getTotalPrice());

	            int rowsAffected = ps.executeUpdate();
	            return rowsAffected > 0;
	        }
	    } catch (SQLException e) {
	        System.out.println("Error adding order: " + e.getMessage());
	        e.printStackTrace();
	        return false;
	    } catch (NullPointerException e) {
	        System.out.println("Order or Pizza object is null. Please ensure valid data is passed.");
	        e.printStackTrace();
	        return false;
	    } catch (Exception e) {
	        System.out.println("An unexpected error occurred while adding the order: " + e.getMessage());
	        e.printStackTrace();
	        return false;
	    }
	}


	public List<Order> getOrdersByUserId(int userId) {
	    List<Order> orders = new ArrayList<>();
	    try (Connection connection = DatabaseConnection.getConnection()) {
	        String sql = "SELECT * FROM orders WHERE user_id = ?";
	        try (PreparedStatement ps = connection.prepareStatement(sql)) {
	            ps.setInt(1, userId);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	                int orderId = rs.getInt("order_id");
	                int pizzaId = rs.getInt("pizza_id");
	                int quantity = rs.getInt("quantity");
	                double totalPrice = rs.getDouble("total_price");

	                Pizza pizza = getPizzaById(pizzaId);
	                if (pizza != null) {
	                    Order order = new Order(orderId, userId, pizza, quantity);
	                    orders.add(order);
	                }
	            }
	        }
	    } catch (SQLException e) {
	        System.out.println("Error retrieving orders: " + e.getMessage());
	        e.printStackTrace();
	    } catch (Exception e) {
	        System.out.println("An unexpected error occurred while fetching orders: " + e.getMessage());
	        e.printStackTrace();
	    }
	    return orders;
	}


	public Pizza getPizzaById(int pizzaId) {
	    try (Connection connection = DatabaseConnection.getConnection()) {
	        String sql = "SELECT * FROM pizzas WHERE pizza_id = ?";
	        try (PreparedStatement ps = connection.prepareStatement(sql)) {
	            ps.setInt(1, pizzaId);
	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                String name = rs.getString("name");
	                double price = rs.getDouble("price");
	                return new Pizza(pizzaId, name, price);
	            } else {
	                System.out.println("No pizza found with ID: " + pizzaId);
	            }
	        }
	    } catch (SQLException e) {
	        System.out.println("Error retrieving pizza: " + e.getMessage());
	        e.printStackTrace();
	    } catch (Exception e) {
	        System.out.println("An unexpected error occurred while fetching pizza: " + e.getMessage());
	        e.printStackTrace();
	    }
	    return null;
	}
	}
