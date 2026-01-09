import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int number = sc.nextInt();

        int sum =0;
        while(number>0){
            int d =number%10;
            if(d %2 == 0){
                sum += d;
            }
            number /=10;
        }
        System.out.println("sum of even digits = "+ sum);
    }
}