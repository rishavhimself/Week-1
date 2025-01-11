// Import Scanner class from util package for user input
import java.util.Scanner;
// Create UnitConverter3 Class to convert units of given parameters
public class UnitConverter3 {

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

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Calling conversion methods for conversion of units
        
		// Ask the user to enter Kms
		System.out.print("Enter kilometers to convert to miles: ");
        double km = scanner.nextDouble();
        
		// Displaying result
		System.out.println(km + " kilometers is " + convertKmToMiles(km) + " miles.");

		// Ask the user to enter miles
        System.out.print("Enter miles to convert to kilometers: ");
        double miles = scanner.nextDouble();
        
		// Displaying result
		System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");

		// Ask the user to enter meters
        System.out.print("Enter meters to convert to feet: ");
        double meters = scanner.nextDouble();
		
		// Displaying result
        System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");
		
		// Ask the user to enter feets
        System.out.print("Enter feet to convert to meters: ");
        double feet = scanner.nextDouble();
		
		// Displaying result
		System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");

		// Ask the user to yards
        System.out.print("Enter yards to convert to feet: ");
        double yards = scanner.nextDouble();
		
		// Displaying result
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");

		// Ask the user to feet
        System.out.print("Enter feet to convert to yards: ");
        feet = scanner.nextDouble();
		
		// Displaying result
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");

        // Ask the user to enter meters
		System.out.print("Enter meters to convert to inches: ");
        meters = scanner.nextDouble();
        
		// Displaying result
		System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");

		// Ask the user to inches
        System.out.print("Enter inches to convert to meters: ");
        double inches = scanner.nextDouble();
		
		// Displaying result
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");

		// Ask the user to inches
        System.out.print("Enter inches to convert to centimeters: ");
        inches = scanner.nextDouble();
		
		// Displaying result
        System.out.println(inches + " inches is " + convertInchesToCentimeters(inches) + " centimeters.");

		// Ask the user to enter Fahrenheit
        System.out.print("Enter Fahrenheit to convert to Celsius: ");
        double fahrenheit = scanner.nextDouble();
		
		// Displaying result
        System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");

		// Ask the user to enter the celsius
        System.out.print("Enter Celsius to convert to Fahrenheit: ");
        double celsius = scanner.nextDouble();
		
		// Displaying result
        System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");

		// Ask the user to enter pounds
        System.out.print("Enter pounds to convert to kilograms: ");
        double pounds = scanner.nextDouble();
		
		// Displaying result
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");

		// Ask the user to enter Kilograms
        System.out.print("Enter kilograms to convert to pounds: ");
        double kilograms = scanner.nextDouble();
		
		// Displaying result
        System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");

		// Ask the user to enter Gallon
        System.out.print("Enter gallons to convert to liters: ");
        double gallons = scanner.nextDouble();
		
		// Displaying result
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");

		// Ask the user to enter Liters
        System.out.print("Enter liters to convert to gallons: ");
        double liters = scanner.nextDouble();
		
		// Displaying result
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");

		// Close the scanner
        scanner.close();
    }
}
