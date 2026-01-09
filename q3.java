import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        int rev=0;
        int temp = number;
        while(temp >0){
            int d = temp%10;
            rev = rev*10+d;
            temp /=10;
        }
        if(rev == number){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
