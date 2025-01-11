// Import Scanner class from util package for user input
import java.util.Scanner;
// Create BMICalculator Class to compute BMI of individuals
public class BMICalculator {

    // Create calculateBMI method to calculate BMI for each person
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];  // Weight in kg
            double heightInCm = data[i][1];  // Height in cm
            double heightInMeters = heightInCm / 100;  // Convert height to meters
            double bmi = weight / (heightInMeters * heightInMeters);  // BMI formula
            data[i][2] = bmi;  // Store the BMI value in the third column of the array
        }
    }

    // Create getBMIStatus method to determine BMI status for each person and return an array of statuses
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];  // Get the BMI for each person
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi <= 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];  // 10 persons, 3 columns (Weight, Height, BMI)

        // Ask the user to enter the details (Weight and Height)
        System.out.println("Enter the weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            data[i][0] = scanner.nextDouble();  // Weight input
            System.out.print("Height (cm): ");
            data[i][1] = scanner.nextDouble();  // Height input
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Get BMI status for each person
        String[] bmiStatus = getBMIStatus(data);

        // Display the results
        System.out.println("\nBMI Calculation and Status:");
        System.out.println("Person | Weight (kg) | Height (cm) | BMI     | Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d | %12.2f | %11.2f | %7.2f | %s%n", (i + 1), data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }

		// Close the scanner
        scanner.close();
    }
}
