//Importing Scanner class from util package for taking input from user 
import java.util.Scanner;
// Creating class AreaOfTriangle for calculating area of triangle 
public class AreaOfTriangle {
    public static void main(String[] args) { 
	// creating input object for taking input 
        Scanner input = new Scanner(System.in);

        // Prompt User for input of base and height of the triangle
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle (in inches): ");
        double height = input.nextDouble();

        // Calculate area in squareinches and squarecentimeters
        double areaInInches = 0.5 * base * height;
        double areaInCentimeters = areaInInches * 6.4516; // 1 square inch = 6.4516 square cm

        // Print the results
        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCentimeters + " square centimeters.");
    }
}
