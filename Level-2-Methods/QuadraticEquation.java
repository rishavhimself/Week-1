// Import Scanner class from util package for user input
import java.util.Scanner;
// Create QuadraticEquation Class to compute roots of given equation
public class QuadraticEquation {

    // Create findRoots method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;  // Calculate the discriminant
        
        // If delta is positive, there are two distinct real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);  // First root
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);  // Second root
            return new double[] { root1, root2 };  // Return the two roots
        }
        // If delta is zero, there is one real root
        else if (delta == 0) {
            double root = -b / (2 * a);  // Single root
            return new double[] { root };  // Return the one root
        }
        // If delta is negative, there are no real roots
        else {
            return new double[0];  // Return an empty array
        }
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Check if 'a' is zero, as it would not be a quadratic equation
        if (a == 0) {
            System.out.println("Not a quadratic equation. 'a' cannot be zero.");
        } else {
            // Find the roots
            double[] roots = findRoots(a, b, c);

            // Display the roots based on delta value
            if (roots.length == 0) {
                System.out.println("No real roots exist.");
            } else if (roots.length == 1) {
                System.out.println("One real root: " + roots[0]);
            } else {
                System.out.println("Two real roots: " + roots[0] + " and " + roots[1]);
            }
        }

		// Close the scanner
        scanner.close();
    }
}
