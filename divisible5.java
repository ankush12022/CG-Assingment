import java.util.*;

class divisible5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if( number % 5 == 0){
            System.out.println("Is the number " + number + " divisible by 5");
        }else{
            System.out.println("Not");
        }
    }
}