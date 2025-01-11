// Import Scanner class from util package for user input
import java.util.Scanner;
// Create UnitConverter Class to convert the unit
public class UnitConverter {

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

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Calling conversion methods to convert the units
        System.out.print("Enter kilometers to convert to miles: ");
        double km = scanner.nextDouble();
		
		// Displaying result
        System.out.println(km + " kilometers is " + convertKmToMiles(km) + " miles.");

        System.out.print("Enter miles to convert to kilometers: ");
        double miles = scanner.nextDouble();
        
		// Displaying result
		System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");

        System.out.print("Enter meters to convert to feet: ");
        double meters = scanner.nextDouble();
        
		// Displaying result
		System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");

        System.out.print("Enter feet to convert to meters: ");
        double feet = scanner.nextDouble();
        
		// Displaying result
		System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");
		
		// Close the scanner
        scanner.close();
    }
}
