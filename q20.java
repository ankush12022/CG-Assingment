import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        System.out.println("enter tthe elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int naturalsum = (n*(n+1))/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        int missing = naturalsum - sum;
        System.out.println("Missing number is "+missing);
    }
}
