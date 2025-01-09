// Import Scanner class from util package for user input
import java.util.Scanner; 
// Create TravelComputation Class to compute the Distance and Travel Time
class TravelComputation {
   
    public static void main(String[] args) {
        
       // Create a Scanner object for taking input
       Scanner scanner = new Scanner(System.in);
      // Ask the user to enter name
       System.out.println("Enter the name of person");
       String name = scanner.nextLine();
       
       // Ask the user to enter City of Origin 
       System.out.println("Enter the name of Origin city");
       String fromCity = scanner.nextLine();
       // Ask the user to enter Via City
       System.out.println("Enter the name of Via city");
       String viaCity = scanner.nextLine();
       // Ask the user to enter City of Destiantion
       System.out.println("Enter the name of Destination city");
       String toCity = scanner.nextLine();
 
       // Ask the user to enter distance between origin and via cities 
       System.out.println("Enter distance between origin and via cities in meters");
       double distanceFromToVia = scanner.nextDouble();
 
       // Ask the user to enter time duration of travel between origin and via cities in minutes
       System.out.println("Enter time duration of travel between origin and via cities in minutes");
       int timeFromToVia = scanner.nextInt();
 
       // Ask the user to enter distance between via and destination cities
       System.out.println("Enter distance between via and destination cities in meters");
       double distanceViaToFinalCity = scanner.nextDouble();
 
       // Ask the user to enter ime duration of travel between via and destination cities in minutes
       System.out.println("Enter time duration of travel between via and destination cities in minutes");
       int timeViaToFinalCity = scanner.nextInt();
 
       // Create a variable totalDistance to indicate the total distance
       // between the fromCity to toCity
       double totalDistance = distanceFromToVia + distanceViaToFinalCity;
 
       // Create a variable totalTime to indicate the total time taken to
       // travel from fromCity to toCity in minutes
       int totalTime = timeFromToVia + timeViaToFinalCity;
 
 
       // Print the travel details
       System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + (double)totalDistance/1000 + " km and " + 
       "the Total Time taken is " + totalTime + " minutes");
     
        // Close the scanner to prevent resource leak
        scanner.close();
    }
 }
 