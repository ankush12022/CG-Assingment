import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    c++;
                    break;
                }
            }
        }
        if(c==0){
            System.out.println("No duplicates");
        }else{
            System.out.println("Duplicates");
        }
    }
}
