// Import Scanner class from util package for user input
import java.util.Scanner;
// Create StudentVoteChecker Class to check if a student can cast vote
public class StudentVoteChecker {

    // Creating canStudentVote method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; // Eligible to vote if age is 18 or more
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10]; // Array to store ages of 10 students

		// Ask the user to enter ages
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            
			// Ask the user to enter the age of a student
			System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

		// Displaying results
        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") is NOT eligible to vote.");
            }
        }
		
		// Close the scanner
        scanner.close();
    }
}
