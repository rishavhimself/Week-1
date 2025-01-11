// Import Random class from util package
import java.util.Random;
// Create StudentScores Class to display score of students
public class StudentScores {
    public static void main(String[] args) {
        int numberOfStudents = 5; // You can change this value
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3]; // [Physics, Chemistry, Math]
        double[][] results = new double[numberOfStudents][3]; // [Total, Average, Percentage]

        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 40 + random.nextInt(61); // Physics
            scores[i][1] = 40 + random.nextInt(61); // Chemistry
            scores[i][2] = 40 + random.nextInt(61); // Math

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
			// Displaying result
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f\n", i + 1, scores[i][0], scores[i][1], scores[i][2], total, average, percentage);
        }
    }
}
