package services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuService {

    public int getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        int selection = -1;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Please select an option (1-5): ");
                selection = scanner.nextInt(); // Read user input

                // Validate range
                if (selection < 1 || selection > 5) {
                    throw new IllegalArgumentException("Invalid option, please choose between 1 and 5.");
                }
                valid = true; // Input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input from the scanner
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Display custom error message
            }
        }
        return selection;
    }
}
