// Import Scanner class from util package for user input
import java.util.Scanner;
// Create OddEvenNumbers Class to check whether the given number is odd or even
public class OddEvenNumbers {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // // Ask the user to enter a number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number >= 1) {
            // Print odd and even numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        } else {
            System.out.println("Please enter a natural number greater than 0.");
        }
		 // Close the scanner
        scanner.close();
    }
}
