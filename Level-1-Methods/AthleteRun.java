// Import Scanner class from util package for user input
import java.util.Scanner;
// Create AthleteRun Class to compute number of rounds
public class AthleteRun {
	
	// Creating calculateRounds method to compute number of rounds
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(5000 / perimeter);
    }

    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the sides of triangle
        System.out.print("Enter the three sides of the triangle in meters: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        // Calling calculateRounds method and displaying result
		System.out.println("The athlete needs to complete " + calculateRounds(side1, side2, side3) + " rounds.");
        
		// Close the scanner
		scanner.close();
    }
}