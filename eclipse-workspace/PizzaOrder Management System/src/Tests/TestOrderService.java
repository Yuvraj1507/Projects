package Tests;

import models.Pizza;
import models.Order;
import services.OrderService;
import services.UserService;

public class TestOrderService {
    public static void main(String[] args) {
        // Initialize services
        OrderService orderService = new OrderService();
        UserService userService = new UserService();

        // Assuming the 'user_id' of the test user created in the database is 101
        int userId = 101;  // Replace with the actual user_id if different

        // Step 1: Add a new order for userId 101
        Pizza pizza = new Pizza(1, "Margherita", 12.99);  // Assuming pizza ID 1 exists in the database
        Order order = new Order(0, userId, pizza, 2);  // Creating an order for 2 pizzas

        // Attempt to add the order to the database
        boolean isOrderAdded = orderService.addOrder(order);
        if (isOrderAdded) {
            System.out.println("Order added successfully!");
        } else {
            System.out.println("Failed to add order.");
        }

        // Step 2: Retrieve orders by user ID
        System.out.println("\nFetching orders for User ID: " + userId);
        var orders = orderService.getOrdersByUserId(userId);

        if (orders.isEmpty()) {
            System.out.println("No orders found for user ID: " + userId);
        } else {
            for (Order fetchedOrder : orders) {
                System.out.println(fetchedOrder);
            }
        }
    }
}
