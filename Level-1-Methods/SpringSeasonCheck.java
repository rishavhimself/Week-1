// Import Scanner class from util package for user input
import java.util.Scanner;
// Create SpringSeasonCheckProgram Class to find if the given season is spring

public class SpringSeasonCheckProgram {

	// Creating isSpringSeason method to check if the given day is a day of spring season
    public static boolean isSpringSeason(int month, int date) {
        return (month == 3 && date >= 20) ||  // Late March 
		(month > 3 && month < 6) ||           // Month of April and May
		(month == 6 && date <= 20);           // Early Juhne
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
		
        // Ask the user to enter the Date
		System.out.print("Enter Date: [1-31] ");
        int date = scanner.nextInt();
		
		// Ask the user to enter the month
        System.out.print("Enter month: [1-12] ");
        int month = scanner.nextInt();
		
		// Calling isSpringSeason method and displaying result
        System.out.println(isSpringSeason(month, day) ? "It's Spring Season" : "Not a Spring Season");
        
		// Close the scanner
		scanner.close();
    }
}