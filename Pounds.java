import java.util.*;

public class Pounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.println("Enter the weight in pounds");
        float weight = sc.nextFloat();

        float pounds = weight * 2.2f;

        // Output
        System.out.println("The weight of the person in pound is " 
                + weight + " and in kg is " + pounds);
    }
}
