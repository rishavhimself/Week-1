// Import Scanner class from util package for user input
import java.util.Scanner;
// Create MeanHeight Class to compute mean of heights of given individuals
public class MeanHeight {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Define an array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Input : Ask the user to enter
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        // Calculate and Output: Mean height
        double mean = sum / heights.length;
        System.out.println("The mean height of the football team is: " + mean);
		// Close the scanner
        scanner.close();
    }
}
