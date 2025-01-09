// Import Scanner class from Util package for taking input from user
import java.util.Scanner; 
// Create a Class named as Division to compute quotient and remainder
public class Division {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the first number
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        // Ask the user to enter the second number
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        // Calculate the quotient using the division operator
        int quotient = number1 / number2;

        // Calculate the remainder using the modulus operator
        int remainder = number1 % number2;

        // Display the results
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2 + ".");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
