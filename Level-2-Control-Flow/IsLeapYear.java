// Import Scanner class from util package for user input
import java.util.Scanner;
// Create IsLeapYear Class to check if the given year is a leap year
public class IsLeapYear {

    // Method containing a single if statement including logical operators
    public static String checkLeapYWithSingleIf(int year) {
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            return year + " is a Leap Year.";
        } else if (year >= 1582) {
            return year + " is not a Leap Year.";
        } else {
            return "Invalid year. The year must be >= 1582.";
        }
    }

    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
		// Ask the user to the year 
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println("Using a single if condition containing logical operators:");
        System.out.println(checkLeapYWithSingleIf(year));
		// Close the scanner
        scanner.close();
    }
}

