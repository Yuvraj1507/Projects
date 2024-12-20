package Tests;

import models.User;
import services.UserService;

public class UserServiceTest {
    public static void main(String[] args) {
        // Initialize UserService
        UserService userService = new UserService();
        
        // Test 1: User Registration
        System.out.println("Testing User Registration...");
        User newUser = new User(0, "john_doe", "password123");  // Creating a new user with a sample username and password
        boolean isRegistered = userService.registerUser(newUser);
        if (isRegistered) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }

        // Test 2: User Login with the newly registered user
        System.out.println("\nTesting User Login...");
        String username = "john_doe";  // Username to test login
        String password = "password123";  // Password to test login
        User loggedInUser = userService.loginUser(username, password);
        if (loggedInUser != null) {
            System.out.println("User login successful! Welcome, " + loggedInUser.getUsername());
        } else {
            System.out.println("User login failed. Invalid username or password.");
        }

        // Test 3: User Login with incorrect credentials
        System.out.println("\nTesting User Login with incorrect credentials...");
        String wrongUsername = "wrongUser";  // Incorrect username
        String wrongPassword = "wrongPassword";  // Incorrect password
        User wrongLoginUser = userService.loginUser(wrongUsername, wrongPassword);
        if (wrongLoginUser != null) {
            System.out.println("User login successful! Welcome, " + wrongLoginUser.getUsername());
        } else {
            System.out.println("User login failed. Invalid username or password.");
        }
    }
}
