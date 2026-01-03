import java.util.Scanner;

public class Salarybonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        // Take bonus input
        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Output
        System.out.println("The salary is INR " + salary +
                " and bonus is INR " + bonus +
                ". Hence Total Income is INR " + totalIncome);

        sc.close();
    }
}
