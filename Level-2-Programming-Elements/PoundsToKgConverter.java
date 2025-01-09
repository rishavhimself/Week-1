// Import Scanner class from Util Package for user input
import java.util.Scanner; 
// Create a Class named as PoundToKgConverter to convert the weight into Kilograms
public class PoundsToKgConverter {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the weight in pounds
        System.out.println("Enter the weight in pounds:");
        double weightInPounds = scanner.nextDouble();

        // Convert weight from pounds to kilograms (1 pound = 2.2 kg)
        double weightInKg = weightInPounds / 2.2;

        // Display the results
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKg + ".");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
