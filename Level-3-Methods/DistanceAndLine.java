// Import Scanner class from util package for user input
import java.util.Scanner;
// Create DistanceAndLine Class to compute length of line
public class DistanceAndLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // // Ask the user to enter the coodinates of first point
        System.out.println("Enter coordinates of first point (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        // Ask the user to enter the coodinates of second point
        System.out.println("Enter coordinates of second point (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calculate Euclidean distance
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Euclidean Distance: "+ distance);

        // Calculate line equation
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - (slope * x1);
        System.out.println("Line Equation: y ="+slope +", "+ yIntercept);
        
        // Close the scanner
        scanner.close();
    }
}
