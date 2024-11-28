package models;

import java.util.Date;

public class Order {
    private int orderId;
    private int userId;
    private Pizza pizza;
    private int quantity;
    private double totalPrice;

    // Constructor
    public Order(int orderId, int userId, Pizza pizza, int quantity) {
        this.orderId = orderId;
        this.userId = userId;
        this.pizza = pizza;
        this.quantity = quantity;
        this.totalPrice = pizza.getPrice() * quantity;
    }

    // Getters and setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
               "orderId=" + orderId +
               ", userId=" + userId +
               ", pizza=" + pizza +
               ", quantity=" + quantity +
               ", totalPrice=" + totalPrice +
               '}';
    }
}
