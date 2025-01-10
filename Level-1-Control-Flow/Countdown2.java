// Import Scanner class from util package for user input
import java.util.Scanner;
// Create CountdownFor Class to display the countdown
public class CountdownFor {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the countdown starting number
        System.out.print("Enter the countdown starting value: ");
        int counter = scanner.nextInt();

        // Countdown using a for loop
        System.out.println("Countdown begins:");
        for (int i = counter; i > 0; i--) {
            System.out.println(i); // Print the current value
        }
        System.out.println("Liftoff!");
		 // Close the scanner
        scanner.close();
    }
}
