// Import Scanner class from Util package for taking input from user
import java.util.Scanner; 
// Create a Class named as TriangularPark to comute number of rounds
public class TriangularPark {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the sides of the triangular park
        System.out.println("Enter the length of side 1 in meters:");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the length of side 2 in meters:");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the length of side 3 in meters:");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Convert 5 kilometers to meters
        double distanceToComplete = 5000; // 5 km in meters

        // Calculate the number of rounds required to complete 5 km
        double rounds = distanceToComplete / perimeter;

        // Display the result rounded to the nearest integer
        System.out.println("The total number of rounds the athlete will run is " + (int) Math.ceil(rounds) + " to complete 5 km.");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}