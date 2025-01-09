// Import Scanner class from Util package for taking input from user
import java.util.Scanner;
// Create a Class named as SwapNumbers to swap the given numbers
public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // // Ask the user to enter the first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        // Ask the user to enter the second number
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Swapping the numbers
        double temp = firstNumber;  // Use a temporary variable to hold the first number
        firstNumber = secondNumber; // Assign the second number to the first
        secondNumber = temp;        // Assign the value of temp (first number) to second

        // Output the swapped numbers
        System.out.println("The swapped numbers are " + firstNumber + " and " + secondNumber);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
