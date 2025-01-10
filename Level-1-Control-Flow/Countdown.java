// Import Scanner class from util package for user input
import java.util.Scanner;
// Create Countdown Class to display countdown
public class Countdown {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // // Ask the user to enterthe countdown starting number
        System.out.print("Enter the countdown starting value: ");
        int counter = scanner.nextInt();

        // Countdown using a while loop
        System.out.println("Countdown begins:");
        while (counter > 0) {
            System.out.println(counter); // Print the current value
            counter--; // Decrement the counter
        }
        System.out.println("Liftoff!");
		// Close the scanner
        scanner.close();
    }
}
