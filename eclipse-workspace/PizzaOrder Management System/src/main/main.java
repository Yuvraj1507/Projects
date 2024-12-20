package main;

import models.User;
import services.UserService;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            // Registration logic
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Username and password cannot be empty.");
            } else {
                // Create a User object and pass it to registerUser
                User user = new User(0, username, password); // ID is 0 because it's auto-incremented
                boolean isRegistered = userService.registerUser(user);
                if (isRegistered) {
                    System.out.println("User registered successfully!");
                } else {
                    System.out.println("Registration failed.");
                }
            }
        } else if (choice == 2) {
            // Login logic
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            User user = userService.loginUser(username, password);
            if (user != null) {
                System.out.println("Login successful! Welcome, " + user.getUsername() + "!");
            } else {
                System.out.println("Invalid credentials.");
            }
        } else {
            System.out.println("Invalid option.");
        }

        scanner.close();
    }
}
