// Import Scanner class from util package for user input
import java.util.Scanner;
// Create BMICalculator Class to compute the BMI of a person
public class BMICalculator {

    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter weight and height
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeters * heightMeters);

        // Determine weight status
        String status;
        if (bmi < 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.4 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 39.9) {
            status = "Overweight";
        } else {
            status = "Obesity";
        }

        // Display results
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);
		
		// Close the scanner
        scanner.close();
    }
}
