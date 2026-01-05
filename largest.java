import java.util.*;

class largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input 
        System.out.println("Enter first number");
        int number1 = sc.nextInt();

        System.out.println("Enter second number");
        int number2 = sc.nextInt();

        System.out.println("Enter third number");
        int number3 = sc.nextInt();

        boolean firstLargest = (number1 > number2) && (number1 > number3);
        boolean secondLargest = (number2 > number1) && (number2 > number3);
        boolean thirdLargest = (number3 > number1) && (number3 > number2);

        // Output results
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);
    }
}
