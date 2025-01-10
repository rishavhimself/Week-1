// Import Scanner class from util package for user input
import java.util.Scanner;
// Create SumUntilZero Class to compute sum of number until zero is given as input
public class SumUntilZero {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Initialize the total sum
        double total = 0.0;

        // Loop to take user input and add to the total until user enters 0
        while (true) {
			// Ask the user to enter a number
            System.out.print("Enter a number (enter 0 to stop): ");
            double userInput = scanner.nextDouble();

            // Break the loop if the user enters 0
            if (userInput == 0) {
                break;
            }

            total += userInput; // Add the user input to the total
        }

        // Display the result
        System.out.println("The total sum is: " + total);
		 // Close the scanner
        scanner.close();
    }
}
