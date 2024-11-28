package Tests;

import models.Pizza;
import services.pizzaservice;

import java.util.List;

public class PizzaServiceTest {
    public static void main(String[] args) {
        // Initialize PizzaService
        pizzaservice pizzaService = new pizzaservice();
        
        // Test: Fetch all pizzas
        System.out.println("Fetching all pizzas...");
        List<Pizza> pizzas = pizzaService.getAllPizzas();
        if (pizzas != null && !pizzas.isEmpty()) {
            System.out.println("Pizzas fetched successfully:");
            for (Pizza pizza : pizzas) {
                System.out.println("ID: " + pizza.getPizzaId() + ", Name: " + pizza.getName() + ", Price: $" + pizza.getPrice());
            }
        } else {
            System.out.println("No pizzas found in the database.");
        }

        // Test: Fetch pizza by ID
        int pizzaIdToTest = 1;  // Example pizza ID to test
        System.out.println("\nFetching pizza with ID: " + pizzaIdToTest);
        Pizza pizza = pizzaService.getPizzaById(pizzaIdToTest);
        if (pizza != null) {
            System.out.println("Pizza fetched successfully: " + pizza.getName() + " - $" + pizza.getPrice());
        } else {
            System.out.println("Pizza with ID " + pizzaIdToTest + " not found.");
        }
    }
}
