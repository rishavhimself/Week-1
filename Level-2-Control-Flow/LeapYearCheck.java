// Import Scanner class from util package for user input
import java.util.Scanner;

// Create LeapYearCheck Class to check if given year is a leap year
public class LeapYearCheck {

   
    public static String checkLeapYMultiIfElse(int year) {
        if (year < 1582) {
            return "Invalid year. The year must be >= 1582.";
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return year + " is a Leap Year.";
                } else {
                    return year + " is not a Leap Year.";
                }
            } else {
                return year + " is a Leap Year.";
            }
        } else {
            return year + " is not a Leap Year.";
        }
    }

        public static String checkLeapYearSingleIf(int year) {
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
		// Ask the user to enter year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
		// Display result
        System.out.println("Using multiple if-else statements:");
        System.out.println(checkLeapYMultiIfElse(year));

        System.out.println("\nUsing a single if statement with logical operators:");
        System.out.println(checkLeapYearSingleIf(year));
		// Close the scanner
        scanner.close();
    }
}

