import java.util.*;

class zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number");
            return;
        }
        int loopSum = 0;
        int i = 1;

        while (i <= n) {
            loopSum += i;
            i++;
        }

        int formulaSum = n * (n + 1) / 2;
        System.out.println("Sum using while loop: " + loopSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (loopSum == formulaSum) {
            System.out.println("Both computations are correct and match.");
        } else {
            System.out.println("The computations do not match.");
        }
    }
}
