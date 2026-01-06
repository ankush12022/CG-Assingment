import java.util.*;

class pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.println("Enter Salary: ");
            salary[i] = sc.nextDouble();

            System.out.println("Enter Years of Service: ");
            service[i] = sc.nextDouble();

            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid input! Please enter valid salary and service.");
                i--; 
                continue;
            }
        }

        for (int i = 0; i < 10; i++) {

            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Employee Salary Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println(
                "Employee " + (i + 1) +
                " Old Salary: " + salary[i] +
                " Bonus: " + bonus[i] +
                " New Salary: " + newSalary[i]
            );
        }

        System.out.println("Total Old Salary of all employees: " + totalOldSalary);
        System.out.println("Total Bonus paid by Zara: " + totalBonus);
        System.out.println("Total New Salary after bonus: " + totalNewSalary);

        sc.close();
    }
}
