// Import Scanner class from util package for user input
import java.util.Scanner;
// Create FactorsOfNumber Class to display the factors of a given number
public class FactorsOfNumber {
    public static void main(String[] args) {
		// Create a Scanner object for taking input	
        Scanner scanner = new Scanner(System.in);

        // // Ask the user to enter number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Loop from 1 to number-1
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a factor of the number
                System.out.println(i);  // Print the factor
            }
        }
		
		// Close the scanner
		scanner.close();
    }
}
