// Creating a class named VolumeOfEarth for calculating Volume of the Earth 
public class VolumeOfEarth {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKilometers = 6378;
		// Radius of Earth in miles
        double radiusMiles = radiusKilometers / 1.6;

        // Calculate volume using formula (4/3) * pi * r^3
        double volumeKilometers = (4.0 / 3) * Math.PI * Math.pow(radiusKilometers, 3);
        double volumeMiles = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        // Print the results
        System.out.println("The volume of earth in cubic kilometers is " + volumeKilometers + 
                           " and cubic miles is " + volumeMiles);
    }
}
