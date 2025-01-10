// Import Scanner class from util package for user input
import java.util.Scanner;
// Create BMICalculator Class to compute BMI
public class BMICalculator {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        int numberOfPersons;
		// Ask the user to enter number of person
        System.out.print("Enter number of persons: ");
        numberOfPersons = scanner.nextInt();

        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];
		
		// Storing details of persons
        for (int i = 0; i < numberOfPersons; i++) {
            // Ask the user to enter height
			System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            double height = scanner.nextDouble();

            while (height <= 0) {
                System.out.print("Invalid height. Enter a positive value: ");
                height = scanner.nextDouble();
            }
			// Ask the user to enter weight
            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            double weight = scanner.nextDouble();

            while (weight <= 0) {
                System.out.print("Invalid weight. Enter a positive value: ");
                weight = scanner.nextDouble();
            }

            double bmi = weight / (height * height);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
		// Display result
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + " - Height: " + personData[i][0] + ", Weight: " + personData[i][1] +
                    ", BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
    }
}
