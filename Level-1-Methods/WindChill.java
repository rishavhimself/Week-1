// Import Scanner class from util package for user input
import java.util.Scanner;
// Create WindChill Class to find the wind is chill or not
public class WindChill{
	// Creating calculateWindChill to apply the formula 
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the temperature
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();
		
		// Ask the user to enter the wind speed
        System.out.print("Enter wind speed in mph: ");
        double windSpeed = scanner.nextDouble();
		
		// Calling calculateWindChill method and displaying result
        System.out.println("The wind chill temperature is " + calculateWindChill(temperature, windSpeed));
        
		// Close the scanner
		scanner.close();
    }
}