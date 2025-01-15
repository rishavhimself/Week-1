// Import Scanner class from util package for user input
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate a 1D array of random 2-digit ages for n students
    public static int[] generateAges(int numberOfStudents, Scanner scanner) {
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the age of student "+(i+1));
			ages[i] = scanner.nextInt();
        }
        return ages;
    }

    // Method to evaluate voting eligibility and return a 2D String array
    public static String[][] evaluateVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);

            // Check for negative age or eligibility
            if (ages[i] < 0) {
                results[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }
        return results;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] results, int length) {
        for (int i=0;i<length;i++) {
            System.out.println("The Student "+(i+1)+" "+results[i][1]);
        }
    }

    // Main method to take user input, call the methods, and display results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		// Ask the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Get ages of all students
        int[] ages = generateAges(numberOfStudents,scanner);

        // Evaluate voting eligibility
        String[][] results = evaluateVotingEligibility(ages);

        // Display the results
        displayResults(results, ages.length);

		// Close the scanner
        scanner.close();
    }
}
