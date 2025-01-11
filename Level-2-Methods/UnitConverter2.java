// Import Scanner class from util package for user input
import java.util.Scanner;
// Create UnitConverter2 Class to convert units of given parameters
public class UnitConverter2 {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Calling conversion methods to change the units
        
		// Ask the user to enter the Km
		System.out.print("Enter kilometers to convert to miles: ");
        double km = scanner.nextDouble();
		
		// Displaying result
		System.out.println(km + " kilometers is " + convertKmToMiles(km) + " miles.");


		// Ask the user to enter the miles
        System.out.print("Enter miles to convert to kilometers: ");
        double miles = scanner.nextDouble();
        
		// Displaying result
		System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");

		// Ask the user to enter meters
        System.out.print("Enter meters to convert to feet: ");
        double meters = scanner.nextDouble();
        
		// Displaying result
		System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");
		
		// Ask the user to enter feet
        System.out.print("Enter feet to convert to meters: ");
        double feet = scanner.nextDouble();
        
		// Displaying result
		System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");
		
		// Ask the user to enter yards
        System.out.print("Enter yards to convert to feet: ");
        double yards = scanner.nextDouble();
        
		// Displaying result
		System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");

		// Ask the user to enter feet
        System.out.print("Enter feet to convert to yards: ");
        feet = scanner.nextDouble();
        
		// Displaying result
		System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");

		// Ask the user to enter meters
        System.out.print("Enter meters to convert to inches: ");
        meters = scanner.nextDouble();
        
		// Displaying result
		System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");

		// Ask the user to enter inches
        System.out.print("Enter inches to convert to meters: ");
        double inches = scanner.nextDouble();
        
		// Displaying result
		System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");

		// Ask the user to enter inches
        System.out.print("Enter inches to convert to centimeters: ");
        inches = scanner.nextDouble();
        
		// Displaying result
		System.out.println(inches + " inches is " + convertInchesToCentimeters(inches) + " centimeters.");

		// Close the scanner
        scanner.close();
    }
}
