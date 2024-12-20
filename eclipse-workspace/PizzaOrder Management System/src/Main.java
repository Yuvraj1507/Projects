

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Display the main menu
            System.out.println("Welcome to Pizza Order Management System!");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. View Pizza Menu");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    register(scanner);
                    break;
                case 3:
                    viewPizzaMenu(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using our service!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

	private static void login(Scanner scanner) {
		// TODO Auto-generated method stub
		    System.out.print("Enter your username: ");
		    String username = scanner.next();
		    
		    System.out.print("Enter your password: ");
		    String password = scanner.next();
		    
		    // Implement login logic here (authenticate the user)
		    // You should query the database to check the credentials
		    if (authenticateUser(username, password)) {
		        System.out.println("Login successful!");
		        showUserMenu(scanner);
		    } else {
		        System.out.println("Invalid username or password. Try again.");
		    }
		}

		private static boolean authenticateUser(String username, String password) {
		    // Dummy implementation - replace with actual DB authentication
		    // Example: Check credentials from the database and return true/false
		    return username.equals("testuser") && password.equals("testpass");
		}
	
private static void register(Scanner scanner) {
    System.out.print("Enter your desired username: ");
    String username = scanner.next();
    
    System.out.print("Enter your password: ");
    String password = scanner.next();
    
    // Implement registration logic here (save the new user to the database)
    // For now, we're just simulating registration
    System.out.println("Registration successful! Please log in.");
}
private static void viewPizzaMenu(Scanner scanner) {
    System.out.println("Pizza Menu:");
    System.out.println("1. Margherita - $8.99");
    System.out.println("2. Pepperoni - $9.99");
    System.out.println("3. Veggie - $7.99");
    System.out.println("4. Exit to Main Menu");
    
    System.out.print("Please enter the pizza number to order or 4 to go back: ");
    int choice = scanner.nextInt();
    
    if (choice == 4) {
        return; // Return to the main menu
    }
    
    System.out.print("Enter quantity: ");
    int quantity = scanner.nextInt();
    
    // Call method to add the selected pizza and quantity to the order
    placeOrder(choice, quantity);
}

private static void placeOrder(int pizzaChoice, int quantity) {
    // For now, we simulate pizza selection and order
    double price = 0;
    String pizzaName = "";
    
    switch (pizzaChoice) {
        case 1:
            pizzaName = "Margherita";
            price = 8.99;
            break;
        case 2:
            pizzaName = "Pepperoni";
            price = 9.99;
            break;
        case 3:
            pizzaName = "Veggie";
            price = 7.99;
            break;
        default:
            System.out.println("Invalid pizza choice.");
            return;
    }
    
    double totalPrice = price * quantity;
    System.out.println("You have ordered " + quantity + " " + pizzaName + "(s).");
    System.out.println("Total price: $" + totalPrice);
    
    // Save this order to the database in the real application
}
private static void sortAndFilterPizzas(Scanner scanner) {
    System.out.println("1. Sort by Price (Low to High)");
    System.out.println("2. Filter by Veggie");
    System.out.println("3. Back to Menu");
    
    int choice = scanner.nextInt();
    
    switch (choice) {
        case 1:
            System.out.println("Sorting pizzas by price...");
            // Implement sorting logic here
            break;
        case 2:
            System.out.println("Filtering Veggie pizzas...");
            // Implement filtering logic here
            break;
        case 3:
            return; // Go back to the menu
        default:
            System.out.println("Invalid choice, please try again.");
    }
}
private static void showUserMenu(Scanner scanner) {
    while (true) {
        System.out.println("\nUser Menu:");
        System.out.println("1. View Pizza Menu");
        System.out.println("2. View Order History");
        System.out.println("3. Log Out");
        System.out.print("Please enter your choice: ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                viewPizzaMenu(scanner);
                break;
            case 2:
                viewOrderHistory();
                break;
            case 3:
                System.out.println("Logging out...");
                return; // Log out and return to the main menu
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }
}

private static void viewOrderHistory() {
    // Simulate viewing order history (replace with DB queries in a real app)
    System.out.println("Your order history:");
    System.out.println("1. 2 Margherita Pizzas - $17.98");
    System.out.println("2. 1 Pepperoni Pizza - $9.99");
 }
}