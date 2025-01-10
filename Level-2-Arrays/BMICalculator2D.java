// Import Scanner class from util package for user input
import java.util.Scanner;
// Create BMICalculator2D Class to compute BMI in 2D Array
public class BMICalculator2D {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of person
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[numberOfPersons][3]; // [0] = weight, [1] = height, [2] = BMI
        String[] weightStatus = new String[numberOfPersons]; // Array to store weight status

        // Input weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");

            // Ask the user to enter weight
            System.out.print("Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.print("Invalid weight. Enter a positive value for weight: ");
                personData[i][0] = scanner.nextDouble();
            }

            // Ask the user to enter height
            System.out.print("Height (m): ");
            personData[i][1] = scanner.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.print("Invalid height. Enter a positive value for height: ");
                personData[i][1] = scanner.nextDouble();
            }

            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < =39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display results for each person
        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Person", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n",
                              (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
		
		// Close the scanner
		scanner.close();
    }
}
