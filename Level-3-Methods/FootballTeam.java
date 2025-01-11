// Import Arrays and random class from util package
import java.util.Arrays;
import java.util.Random;
// Create Football Class to compare players
public class FootballTeam {

    public static void main(String[] args) {
        // calling generateRandomHeights method
        int[] heights = generateRandomHeights();
        // Displaying result
        displayResults(heights);
    }

    // Creating generateRandomHeights method to compute random heights
    public static int[] generateRandomHeights() {
        Random random = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // Random heights between 150 and 250
        }
        return heights;
    }
    // Creating displayResults method to print the result
    public static void displayResults(int[] heights) {
        int sum = Arrays.stream(heights).sum();
        double mean = sum / 11.0;
        int min = Arrays.stream(heights).min().getAsInt();
        int max = Arrays.stream(heights).max().getAsInt();

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest Height: " + min + " cm");
        System.out.println("Tallest Height: " + max + " cm");
        System.out.println("Mean Height: " + mean + " cm");
    }
}
