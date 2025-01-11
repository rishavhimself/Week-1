// Import Scanner class from util package for user input
import java.util.Scanner;
// Create ChocolatesDivision Class to find number of chocolates each child gets
public class ChocolatesDivision {
	// Creating divideChocolates method for the same
    public static int[] divideChocolates(int numberOfChocolates, int numberOfChildren) {
        return new int[]{numberOfChocolates / numberOfChildren, numberOfChocolates % numberOfChildren};
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        
		// Ask the user to enter the number of chocolates
		System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();
		
		// Ask the user to enter the number children
        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();
		
		// Calling divideChocolates method 
        int[] chocolatesResult = divideChocolates(chocolates, children);
        
	    // Displaying result
		System.out.println("Each child gets " + chocolatesResult[0] + " chocolates, remaining: " + chocolatesResult[1]);
        
		// Close the scanner
		scanner.close();
    }
}