// Import Scanner class from util package for user input
import java.util.Scanner;
// Create BMICalculator Class to diplay BMI of persons
public class BMICalculator {

    // Method to compute BMI and status for each person
    public static String[][] computeBMI(double[][] heightWeight) {
        String[][] bmiStatus = new String[heightWeight.length][4];

        for (int i = 0; i < heightWeight.length; i++) {
            double weight = heightWeight[i][0];
            double heightInMeters = heightWeight[i][1] / 100.0; // Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            bmi = Math.round(bmi * 100.0) / 100.0; // Round BMI to 2 decimal places

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal weight";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            bmiStatus[i][0] = String.valueOf(weight);
            bmiStatus[i][1] = String.valueOf(heightWeight[i][1]);
            bmiStatus[i][2] = String.valueOf(bmi);
            bmiStatus[i][3] = status;
        }

        return bmiStatus;
    }

    // Method to display BMI results in a tabular format
    public static void displayBMIResults(String[][] bmiStatus) {
        System.out.printf("%-10s %-10s %-10s %-20s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < bmiStatus.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-20s\n", bmiStatus[i][0], bmiStatus[i][1], bmiStatus[i][2], bmiStatus[i][3]);
        }
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        double[][] heightWeight = new double[10][2];
		
		// Ask the user to enter the details
        System.out.println("Enter weight (in kg) and height (in cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d:\n", i + 1);
            System.out.print("Weight (kg): ");
            heightWeight[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            heightWeight[i][1] = scanner.nextDouble();
        }

        // Compute BMI and status
        String[][] bmiStatus = computeBMI(heightWeight);

        // Display the results
        displayBMIResults(bmiStatus);

		// Close the scanner
        scanner.close();
    }
}
