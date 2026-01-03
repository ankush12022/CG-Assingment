import java.util.*;
public class CtF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take Celsius input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Conversion formula
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output
        System.out.println("The " + celsius + " celsius is " 
                           + fahrenheitResult + " fahrenheit");

        sc.close();
    }
}