// Import Scanner class from util package for user input
import java.util.Scanner;
// Create Factors Class to find fators of given number
public class Factors {
	//Creating findFactors method to find the factors
    public static int[] findFactors(int number) {
        int count = 0;

        // Count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array with the count
        int[] factors = new int[count];
        int index = 0;

        // Save the factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // findSum method to find the sum of the factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // findProduct method to find the product of the factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    //  findSumOfSquares method to find the sum of squares of the factors
    public static int findSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find factors and store it to an array
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calling findSum method and display the sum of factors
        int sum = findSum(factors);
        System.out.println("Sum of factors: " + sum);

        // Calling findProduct method and display the product of factors
        long product = findProduct(factors);
        System.out.println("Product of factors: " + product);

        // Calling sumOfSquares method and display the sum of squares of the factors
        int sumOfSquares = findSumOfSquares(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

       // Close the scanner
        scanner.close();
    }
}
