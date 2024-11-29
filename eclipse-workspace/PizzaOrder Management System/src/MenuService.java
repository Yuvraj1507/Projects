import java.util.InputMismatchException;
import java.util.Scanner;
public class MenuService {

    public int getUserSelection() {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        int selection = -1;  // Default value for invalid selection
        boolean valid = false;  // Flag to track if input is valid

        // Loop until the user provides a valid input
        while (!valid) {
            try {
                System.out.print("Please select an option (1-5): ");
                // Read the user input as an integer
                selection = scanner.nextInt();

                // Check if the selection is within the valid range (1-5)
                if (selection < 1 || selection > 5) {
                    // Throw an exception if the selection is outside the valid range
                    throw new IllegalArgumentException("Invalid option, please choose between 1 and 5.");
                }

                // If input is valid, set valid to true and exit the loop
                valid = true;
            } catch (InputMismatchException e) {
                // Handle case when the input is not an integer
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input from the scanner buffer
            } catch (IllegalArgumentException e) {
                // Handle case when the input is not within the valid range (1-5)
                System.out.println(e.getMessage());
            }
        }
        // Return the valid selection
        return selection;
    }
}
