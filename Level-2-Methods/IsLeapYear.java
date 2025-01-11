// Import Scanner class from util package for user input
import java.util.Scanner;
// Create isLeapYear Class to check if given yaer is a leap year
public class IsLeapYear {

    // isLeapYear method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; // Gregorian calendar starts from 1582
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is valid
        if (year < 1582) {
            System.out.println("The year entered is before the Gregorian calendar system (1582). Exiting...");
            return;
        }

        // Determine if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
		
		// Close the scanner
        scanner.close();
    }
}
