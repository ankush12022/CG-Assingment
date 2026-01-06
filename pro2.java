import java.util.*;

class pro2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int arr[] = new int[10];
        for(int i=0; i<10; i++){
            System.out.println("Enter the age :");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<10;i++){
            if(arr[i] >= 18){
                System.out.println("The student can vote "+ arr[i]);
            }else{
                System.out.println("Cannot vote "+ arr[i]);
            }
        }
    }
}
