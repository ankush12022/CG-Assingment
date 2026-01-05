import java.util.*;

class spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter month: ");
        int month = sc.nextInt();

        System.out.println("Enter day: ");
        int day = sc.nextInt();

        // Check spring season
        boolean isSpring =
                (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
