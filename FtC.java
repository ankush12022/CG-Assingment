import java.util.*;

public class FtC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take Fahrenheit input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Conversion formula
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Output
        System.out.println("The " + fahrenheit + 
                           " fahrenheit is " + 
                           celsiusResult + " celsius");

        sc.close();
    }
}
