public class Earth {
    public static void main(String[] args) {
      
        double radiusKm = 6378;

        double kmToMiles = 0.621371;
        double radiusMiles = radiusKm * kmToMiles;

        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Output
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 
                + " and in cubic miles is " + volumeMiles3);
    }
}
