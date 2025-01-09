// Import Scanner class from Util package for taking input from user
import java.util.Scanner; 
// Create a Class named as TemperatureConversion2 to convert the given Fahrenheit Temperature to Celsius
public class TemperatureConversion2 {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the temperature in Fahrenheit
        System.out.println("Enter the temperature in Fahrenheit:");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius.");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
