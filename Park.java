import java.util.*;

public class Park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take sides of the triangular park
        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Total distance to be covered (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate number of rounds
        double rounds = totalDistance / perimeter;

        // Output
        System.out.println("The total number of rounds the athlete will run is "
                + rounds + " to complete 5 km");

        sc.close();
    }
}
