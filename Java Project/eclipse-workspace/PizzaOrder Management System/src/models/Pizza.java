package models;

public class Pizza {
    private int pizzaId;
    private String name;
    private double price;

    // Constructor
    public Pizza(int pizzaId, String name, double price) {
        this.pizzaId = pizzaId;
        this.name = name;
        this.price = price;
    }

    // Getters and setters
    public int getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
               "pizzaId=" + pizzaId +
               ", name='" + name + '\'' +
               ", price=" + price +
               '}';
    }
}

