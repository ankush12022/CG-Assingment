import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        int c =0;
        for(int i =2;i<number/2;i++){
            if(number % i == 0){
                c++;
            }
        }
        if(c == 0){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime");
        }
    }
}
