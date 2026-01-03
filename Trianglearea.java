import java.util.*;

class Trianglearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        System.out.print("Enter base in cm: ");
        double base1 = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height1 = sc.nextDouble();

        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = 0.5*height1*base1;

        // Output
        System.out.println("Your height in cm is " 
                + height1 + " while in feet is " 
                + areaInSqCm + " and in inches is ");
    }
}
