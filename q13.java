import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
