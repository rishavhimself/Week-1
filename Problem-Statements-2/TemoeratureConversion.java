// Import Scanner class from Util package for taking input from user
import java.util.Scanner; 
// Create a Class named as TemoeratureConversion to convert given temperature
public class TemperatureConversion {
	
	public static void fahrenheitToCelsius(Scanner scanner){
		
		// Ask the user to enter the temperature in Fahrenheit
        System.out.println("Enter the temperature in Fahrenheit:");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsius = (fahrenheit - 32) * 5 / 9;
		
		//Display Result
		System.out.println("The "+ fahrenheit +" Fahrenheit is equal to "+celsius+ " Celsius.");
	}
	
	public static void celsiusToFahrenheit(Scanner scanner){
		// Ask the user to enter the temperature in Celsius
        System.out.println("Enter the temperature in Celsius:");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
		System.out.println("The " + celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
	}
	
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
		
        // Ask the user to enter the the type of conversion
		System.out.println("Press 1 for Fahrenheit To Celsius Conversion or Press 2 for Celsius To Fahrenheit Conversion");
        int number = scanner.nextInt();
		
		if(number==1)fahrenheitToCelsius(scanner);
		else if(number==2)celsiusToFahrenheit(scanner);
		else System.out.println("Invalid Input");
        
		// Close the scanner to prevent resource leaks
        scanner.close();
    }
}
