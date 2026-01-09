import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
