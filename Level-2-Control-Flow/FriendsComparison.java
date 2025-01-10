// Import Scanner class from util package for user input
import java.util.Scanner;
// Create FriendsComparison Class to compare given friends
public class FriendsComparison {

    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // // Ask the user to enter ages and heights for Amar, Akbar, and Anthony
        System.out.print("Enter the age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter the height of Amar (in cm): ");
        double heightAmar = scanner.nextDouble();

        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter the height of Akbar (in cm): ");
        double heightAkbar = scanner.nextDouble();

        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter the height of Anthony (in cm): ");
        double heightAnthony = scanner.nextDouble();

        // Determine the youngest friend
        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        // Determine the tallest friend
        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        // Display results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
		// Close the scanner
        scanner.close();
    }
}
