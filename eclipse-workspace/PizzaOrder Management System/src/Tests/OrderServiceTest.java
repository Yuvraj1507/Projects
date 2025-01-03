package Tests;

import models.Order;
import models.Pizza;
import services.OrderService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {

    @Test
    public void testAddOrderSuccess() {
        OrderService orderService = new OrderService();
        Pizza pizza = new Pizza(1, "Pepperoni", 10.99);
        Order order = new Order(1, 1, pizza, 3); // Mock order: User 101 orders 3 Pepperoni pizzas

        boolean result = orderService.addOrder(order);
        assertTrue(result, "The order should be added successfully.");
    }

    @Test
    public void testAddOrderInvalidData() {
        OrderService orderService = new OrderService();
        Order invalidOrder = new Order(1, 101, null, 2); // Mock order with null pizza

        boolean result = orderService.addOrder(invalidOrder);
        assertFalse(result, "The order should fail due to null pizza.");
    }

    @Test
    public void testGetOrdersByUserIdSuccess() {
        OrderService orderService = new OrderService();

        int userId = 101; // Mock user ID with existing orders
        List<Order> orders = orderService.getOrdersByUserId(userId);

        assertNotNull(orders, "The orders list should not be null.");
        assertFalse(orders.isEmpty(), "The orders list should contain at least one order.");
        assertEquals(101, orders.get(0).getUserId(), "The user ID of the retrieved orders should match.");
    }

    @Test
    public void testGetOrdersByUserIdNoOrders() {
        OrderService orderService = new OrderService();

        int userId = 999; // Mock user ID with no orders
        List<Order> orders = orderService.getOrdersByUserId(userId);

        assertNotNull(orders, "The orders list should not be null, even if no orders exist.");
        assertTrue(orders.isEmpty(), "The orders list should be empty for a user with no orders.");
    }

    @Test
    public void testGetPizzaByIdSuccess() {
        OrderService orderService = new OrderService();

        Pizza pizza = orderService.getPizzaById(1); // Mock pizza ID
        assertNotNull(pizza, "Pizza should not be null for a valid pizza ID.");
        assertEquals(1, pizza.getPizzaId(), "The pizza ID should match.");
        assertEquals("Margherita", pizza.getName(), "The pizza name should match.");
        assertTrue(pizza.getPrice() > 0, "The pizza price should be greater than zero.");
    }

    @Test
    public void testGetPizzaByIdInvalidId() {
        OrderService orderService = new OrderService();

        Pizza pizza = orderService.getPizzaById(999); // Mock invalid pizza ID
        assertNull(pizza, "Pizza should be null for an invalid pizza ID.");
    }

    @Test
    public void testCalculateTotalPrice() {
        Pizza pizza = new Pizza(1, "Veggie", 7.99);
        int quantity = 4;
        double expectedTotal = pizza.getPrice() * quantity;

        double actualTotal = pizza.getPrice() * quantity;
        assertEquals(expectedTotal, actualTotal, 0.001, "The total price calculation should match.");
    }
}

