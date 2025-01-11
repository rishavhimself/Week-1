// Import Scanner class from util package for user input
import java.util.Scanner;
// Create Calendar Class to display calendar
public class Calendar {

    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the month
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        // Ask the user to enter the year
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        displayCalendar(month, year);

        // Close the scanner
        scanner.close();
    }

    // Create displayCalendar to print calendar
    public static void displayCalendar(int month, int year) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        int[] days = {
            31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 
            31, 30, 31, 30, 31
        };
        System.out.println("\n   " + months[month - 1] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int firstDay = getFirstDay(month, year);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }
        for (int i = 1; i <= days[month - 1]; i++) {
            System.out.printf("%2d ", i);
            if ((i + firstDay) % 7 == 0) System.out.println();
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDay(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
        
    }
}
