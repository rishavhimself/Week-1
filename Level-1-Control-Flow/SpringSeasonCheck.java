// Import Scanner class from util package for user input
import java.util.Scanner;
// Create SpringSeasonCheck Class to check whether the given season is spring
public class SpringSeasonCheck {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the month and day
        System.out.print("Enter the month [1-12] : ");
        int month = scanner.nextInt();
        System.out.print("Enter the day [1-31] : ");
        int day = scanner.nextInt();

        // Check if the input date falls within the Spring Season (March 20 to June 20)
        boolean isSpringSeason = (month == 3 && day >= 20) || // Late March
                                 (month > 3 && month < 6) ||  // April and May
                                 (month == 6 && day <= 20);   // Early June

        // Display the result
        if (isSpringSeason) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        // Close the scanner
        scanner.close();
    }
}
