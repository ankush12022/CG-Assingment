import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int number = sc.nextInt();

        int temp = number;
        int e =0,o=0;
        while(temp > 0){
            int d = temp%10;
            if(d % 2 == 0){
                e++;
            }else o++;

            temp /= 10;
        }
        System.out.println("Even = "+e+" Odd = "+o);

    }
}