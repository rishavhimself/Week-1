	// Import Scanner class from util package for user input
	import java.util.Scanner;
	// Create IsPrimeNumber Class to check if given number is prime or not
	public class IsPrimeNumber {

		public static void main(String[] args) {
			// Create a Scanner object for taking input
			Scanner scanner = new Scanner(System.in);

			// Ask the user to enter numebr
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();

			// Initialize isPrime to true
			boolean isPrime = true;

			// Check if number is greater than 1
			if (number > 1) {
				// Loop from 2 to number - 1
				for (int i = 2; i < number; i++) {
					if (number % i == 0) {
						// Number is divisible by i, not a prime number
						isPrime = false;
						break;
					}
				}
			} else {
				// Numbers less than or equal to 1 are not prime
				isPrime = false;
			}

			// Output result
			if (isPrime) {
				System.out.println(number + " is a Prime Number.");
			} else {
				System.out.println(number + " is not a Prime Number.");
			}
			
			// Close the scanner
			scanner.close();
		}
	}
