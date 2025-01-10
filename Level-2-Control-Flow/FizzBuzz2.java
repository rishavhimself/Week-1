// Import Scanner class from util package for user input
import java.util.Scanner;
// Create FizzBuzz2 Class to check if the given number is a multiple of 3, 5 or both
public class FizzBuzz2 {

    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter a positive integer: ");
        double number = scanner.nextdouble();

        // Check if the number is positive
        if (number > 0) {
            int i = 0;
			// while loop
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
		// Close the scanner
        scanner.close();
    }
}
