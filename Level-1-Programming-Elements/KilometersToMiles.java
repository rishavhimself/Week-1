// importing scanner class from util package for taking input 
import java.util.Scanner;
//Creating a class named KilometersToMiles to convert kilometers to miles 
public class KilometersToMiles {
    public static void main(String[] args) {
	// creating input object for taking input 
        Scanner input = new Scanner(System.in);

        // Prompt user to enter distance in kilometers
        System.out.println("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        // Convert kilometers to miles
        double miles = kilometers / 1.6;

        // Print the result
        System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km");
    }
}
