// Import Scanner class from util package for user input
import java.util.Scanner;
// Create FrequencyOfCharacters Class to find Frequency Of Characters
public class FrequencyOfCharacters {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters (ASCII values)

        // Loop through the text to count frequencies
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequency[c]++;
        }

        // Count unique characters for the result array size
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
        }

        return result;
    }

    // Method to display the character frequency table
    public static void displayCharacterFrequency(String[][] frequencies) {
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        System.out.println("---------------------");

        for (String[] row : frequencies) {
            System.out.printf("%-10s %-10s\n", row[0], row[1]);
        }
    }

    // Main method to take user input and display character frequencies
    public static void main(String[] args) {
        
		// Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);

		// Ask the user to enter the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the character frequencies
        String[][] frequencies = findCharacterFrequency(text);

        // Display the results
        displayCharacterFrequency(frequencies);

		// Close the scanner
        scanner.close();
    }
}
