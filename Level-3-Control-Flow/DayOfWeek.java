// Import Scanner class from util package for user input
import java.util.Scanner;
// Create DayOfWeek Class to get the day of the week by the date
public class DayOfWeek {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user to enter Date, Month and Year
        System.out.print("Enter date (1-31): ");
        int d = scanner.nextInt();
		System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();
        System.out.print("Enter year: ");
        int y = scanner.nextInt();

        // Formula to calculate day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Output: Print the day of the week
        System.out.println("Day of the week: " + d0 + " (0=Sunday, 1=Monday, ..., 6=Saturday)");
		// Close the scanner
        scanner.close();
    }
}
