// Import Scanner class from util package for user input
import java.util.Scanner;
// Create CountDigits Class to count number of digits
public class CountDigits {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter numeber
        System.out.print("Enter an integer to count its digits: ");
        int number = scanner.nextInt();

        int count = 0; // Initialize count to 0

        // Process: Count digits by removing one digit in each iteration
        while (number != 0) {
            number /= 10; // Remove the last digit
            count++; // Increment the count
        }

        // Display the number of digits
        System.out.println("The number of digits is: " + count);
		// Close the scanner
        scanner.close();
    }
}
