// Import Scanner class from util package for user input
import java.util.Scanner;
// Create StudentMarks2D Class to compute grades of students
public class StudentMarks2D {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents;
		
		// Ask the user to enter number of students
        System.out.print("Enter the number of students: ");
        numberOfStudents = scanner.nextInt();

        double[][] marks = new double[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
		
		// Ask the user to enter marks
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextDouble();

                while (marks[i][j] < 0) {
                    System.out.print("Invalid marks. Enter a positive value: ");
                    marks[i][j] = scanner.nextDouble();
                }
            }

            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 75) {
                grades[i] = "B";
            } else if (percentages[i] >= 50) {
                grades[i] = "C";
            } else {
                grades[i] = "D";
            }
        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + " - Marks: " + marks[i][0] + ", " + marks[i][1] + ", " + marks[i][2] +
                    ", Percentage: " + percentages[i] + ", Grade: " + grades[i]);
        }
		// Close the scanner
		scanner.close();
    }
}
