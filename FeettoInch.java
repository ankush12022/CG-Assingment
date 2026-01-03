import java.util.*;

public class FeettoInch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Output
        System.out.println("Your Height in cm is " + heightCm +
                " while in feet is " + feet + " and inches is " + inches);

    }
}
