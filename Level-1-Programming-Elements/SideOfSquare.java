//Importing Scanner class from util package for taking input from user 
import java.util.Scanner;
// Creating class named SideOfSquare for calculating side of the square 
public class SideOfSquare {
    public static void main(String[] args) {
		// creating input object for taking input 
        Scanner input = new Scanner(System.in);

        // Prompt user for input of perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate the side length
        double side = perimeter / 4;

        // Print the results
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter + ".");
    }
}
