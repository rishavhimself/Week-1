// Import Scanner class from util package for user input
import java.util.Scanner;
// Create PowerOfNumber Class to compute the value of power of a given number
public class PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // // Ask the user to enter number and power
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize the result variable
        int result = 1;

        // Loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply result by number in each iteration
        }

        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
		
		// Close the scanner
		scanner.close();
	}
}
