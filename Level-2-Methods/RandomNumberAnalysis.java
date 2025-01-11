// Import Random class from util package to get random number
import java.util.Random;
// Create RandomNumberAnalysis Class to analyze a random number
public class RandomNumberAnalysis {

    // Create generate4DigitRandomArray method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            // Generating a random 4-digit number (between 1000 and 9999)
            numbers[i] = 1000 + random.nextInt(9000);  // random.nextInt(9000) generates a number between 0 and 8999, adding 1000 gives a 4-digit number
        }

        return numbers;
    }

    // Create findAverageMinMax method to find the average, min and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];  // To store average, min and max values

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;

        // Loop through the array to calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);  // Find the minimum value
            max = Math.max(max, num);  // Find the maximum value
        }

        // Calculate the average
        double average = sum / numbers.length;

        // Store the average, min, and max in the result array
        result[0] = average;
        result[1] = min;
        result[2] = max;

        return result;
    }

    public static void main(String[] args) {
        int size = 5;  // Generate 5 random numbers
        int[] numbers = generate4DigitRandomArray(size);  // Generate 5 random 4-digit numbers

        // Find average, min, and max of the generated numbers
        double[] result = findAverageMinMax(numbers);

        // Display the results
        System.out.println("Generated 4-digit random numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("\nAverage: " + result[0]);
        System.out.println("Minimum value: " + result[1]);
        System.out.println("Maximum value: " + result[2]);
		
		// Close the scanner
		scanner.close();
    }
}
