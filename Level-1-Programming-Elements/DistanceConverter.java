// importing Scanner class from util package to take input from user 
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Constants
        final double feetPerYard = 3.0;
        final double yardsPerMile = 1760.0;

        // creating input object for taking input 
        Scanner scanner = new Scanner(System.in);

        // Prompt User for input of distance of one unit
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Calculations
        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Output results
        System.out.println("Distance in yards: "+distanceInYards+" Yards");
        System.out.println("Distance in miles: "+distanceInMiles+" Miles");

        // Close scanner
        scanner.close();
    }
}