import java.util.*;

public class KmtoMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();

        double miles = km / 1.6;

        // Output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
    }
}
