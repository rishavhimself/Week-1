// Import Scanner class from util package for user input
import java.util.Scanner;
// Create VotingEligibility Class to check if a student can ast vote
public class VotingEligibility {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Define an array to store ages of 10 students
        int[] ages = new int[10];

        // Input: Ask the user to enter the ages
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = scanner.nextInt();
        }

        // Process and Output: Check voting eligibility
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }
		// Close the scanner
        scanner.close();
    }
}
