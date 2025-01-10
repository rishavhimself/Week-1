// Import Scanner class from util package for user input
import java.util.Scanner;
// Create FriendsComparisons Class to compare height and age of given friends 
public class FriendsComparisons {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
			// Ask the user to enter ages
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
			// Ask the user to enter heights
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
		// Display Results
        System.out.println("Youngest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);
		
		// Close the scanner
		scanner.close();
    }
}
