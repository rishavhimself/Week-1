// Import Scanner class from util package for user input
// Import Random class from util package to generate marks
import java.util.Random;
import java.util.Scanner;
// Create StudentScorecard Class to generate scorecard
public class StudentScorecard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(91) + 10; // Physics score
            scores[i][1] = random.nextInt(91) + 10; // Chemistry score
            scores[i][2] = random.nextInt(91) + 10; // Math score
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return stats;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];

        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];

			if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "c";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("Student   "+ "Physics   "+"Chemistry   "+
		"Math         "+"Total         "+"Average   "+"Percentage  "+"Grade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println( (i + 1)+"         "+scores[i][0]+"         "+scores[i][1]+"         "+scores[i][2]
			+"           "+stats[i][0]+"         "+stats[i][1]+"       "+
			stats[i][2]+"       "+grades[i]);
        }
    }

    // Main method to drive the program
    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

		// Ask the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random scores for the students
        int[][] scores = generateScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] stats = calculateStats(scores);

        // Calculate grades
        String[] grades = calculateGrades(stats);

        // Display the scorecard
        displayScorecard(scores, stats, grades);

		// Close the scanner
        scanner.close();
    }
}
