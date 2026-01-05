import java.util.*;

class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of " + n + " is " + factorial);
    }
}
