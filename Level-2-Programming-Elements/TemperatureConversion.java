// Import Scanner class from Util package for taking input from user
import java.util.Scanner; 
// Create a Class named as TemoeratureConversion to convert given temperature in Fahrenheit 
public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the temperature in Celsius
        System.out.println("Enter the temperature in Celsius:");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheit + " Fahrenheit.");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
