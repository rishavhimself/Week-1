// Import Scanner class from util package for user input
import java.util.Scanner;
// Create CalendarDisplay Class to Display calendar
public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return days[month - 1];
    }

    // Method to get the first day of the month (0=Sunday, 1=Monday, ... 6=Saturday)
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1; // The first day of the month
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m) / 12) % 7;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.printf("\n    %s %d\n", monthName, year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print initial spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);
            if ((day + firstDay) % 7 == 0 || day == daysInMonth) {
                System.out.println(); // Move to the next line after Saturday
            }
        }
    }

    // Main method to take user input and display the calendar
    public static void main(String[] args) {
		
        // Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		// Ask the user to enter the month
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
		
		// Ask the user to enter the year
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar
        displayCalendar(month, year);

		// Close the scanner
        scanner.close();
    }
}