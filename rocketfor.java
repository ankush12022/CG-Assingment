import java.util.*;

class rocketfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown number: ");
        int n = sc.nextInt();

        for (int counter = n; counter >= 1; counter--) {
            System.out.println(counter);
        }

        System.out.println("Launch!");
    }
}
