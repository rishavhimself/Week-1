// Import Scanner class from util package for user input
import java.util.Scanner;
// Create SumOfNaturalNumbers Class to compute the sum of given natural numbers
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number (0 or positive)
        if (number >= 0) {
            // Calculate the sum of the first n natural numbers using the formula
            int sum = number * (number + 1) / 2;

            // Display the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Display that the input is not a natural number
            System.out.println("The number " + number + " is not a natural number.");
        }

        // Close the scanner
        scanner.close();
    }
}
