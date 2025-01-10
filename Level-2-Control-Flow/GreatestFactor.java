	// Import Scanner class from util package for user input
	import java.util.Scanner;
	// Create GreatestFactor Class to find the greatest factor of a given number
	public class GreatestFactor {
		public static void main(String[] args) {
	// Create a Scanner object for taking input
			Scanner scanner = new Scanner(System.in);

			// // Ask the user to enter number
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();

			// Initialize the greatestFactor variable
			int greatestFactor = 1;

			// Loop from number-1 to 1
			for (int i = number - 1; i > 0; i--) {
				if (number % i == 0) {  // Check if i is a divisor of number
					greatestFactor = i;  // Update greatest factor
					break;  // Exit the loop as we found the greatest factor
				}
			}

			// Print the greatest factor
			System.out.println("The greatest factor of " + number + " (beside itself) is: " + greatestFactor);
			
			// Close the scanner
			scanner.close();
		}
	}
