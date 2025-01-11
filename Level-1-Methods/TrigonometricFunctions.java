// Import Scanner class from util package for user input
import java.util.Scanner;
// Create TrigonometricFunctions Class to compute Trigonometric Values for given angle
public class TrigonometricFunctions {
	
	//Creating calculateTrigonometricFunctions to compute Trigonometric Values
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the angle
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();
		
		// Calling calculateTrigonometricFunctions
        double[] trigValues = calculateTrigonometricFunctions(angle);
		
		// Displaying result
		System.out.println("The various Trigonometric Functions for given angle are : "+)
		System.out.println("Sine Value: "+ trigValues[0]);
		System.out.println("Cosine Value: "+ trigValues[1]);
		System.out.println("Tangent Value: "+ trigValues[2]);
		
		// Close the scanner
		scanner.close();
	}
}