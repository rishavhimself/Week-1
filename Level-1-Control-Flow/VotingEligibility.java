// Import Scanner class from util package for user input
import java.util.Scanner;
// Create VotingEligibility Class to check if a person is eligibile to cast vote
public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their age
        System.out.print("Enter the person's age: ");
        int age = scanner.nextInt();

        // Check if the person is eligible to vote
        if (age >= 18) {
            // Display eligibility message
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Display non-eligibility message
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the scanner
        scanner.close();
    }
}
