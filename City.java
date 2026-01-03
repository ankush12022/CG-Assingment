import java.util.*;

public class City {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String inputs
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter To City: ");
        String toCity = sc.nextLine();

        // Distance inputs (in miles)
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = sc.nextDouble();

        // Time input (in hours)
        System.out.print("Enter total time taken (in hours): ");
        double timeTaken = sc.nextDouble();

        // Calculations
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        // Output
        System.out.println("\nTravel Details:");
        System.out.println("Name: " + name);
        System.out.println("Journey: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Time Taken: " + timeTaken + " hours");
        System.out.println("Average Speed: " + averageSpeed + " miles/hour");

        sc.close();
    }
}
