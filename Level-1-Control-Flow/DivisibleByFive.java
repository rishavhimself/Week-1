// Import Scanner class from util package for user input
import java.util.Scanner;
// Create DivisibleByFive Class to check whether a number is divisible by 5
public class DivisibleByFive {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by 5
        boolean isDivisible = (number % 5 == 0);

        // Display the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        // Close the scanner
        scanner.close();
    }
}
