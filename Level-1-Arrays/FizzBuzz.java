// Import Scanner class from util package for user input
import java.util.Scanner;
// Create FizzBuzz Class to display the multiples of 3, 5 or Both
public class FizzBuzz {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Create a String array to save the results
        String[] results = new String[number + 1];

        // Loop from 0 to the input number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz"; // Multiples of both 3 and 5
            } else if (i % 3 == 0) {
                results[i] = "Fizz"; // Multiples of 3
            } else if (i % 5 == 0) {
                results[i] = "Buzz"; // Multiples of 5
            } else {
                results[i] = Integer.toString(i); // Normal number
            }
        }

        // Display the results with positions
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
		// Close the scanner
		scanner.close();
    }
}
