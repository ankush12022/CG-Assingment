import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int number = sc.nextInt();

        int sum =0;
        while(number >0){
            int d = number%10;
            sum = sum+d;
            number /= 10;
        }
        System.out.println(sum);
    }
}
