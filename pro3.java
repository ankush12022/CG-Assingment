import java.util.Scanner;

class pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter five numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                System.out.print(arr[i] + " is Positive ");
                
                if (arr[i] % 2 == 0) {
                    System.out.println("and Even");
                } else {
                    System.out.println("and Odd");
                }

            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            } else {
                System.out.println(arr[i] + " is Zero");
            }
        }

        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and Last elements are Equal");
        } else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is Greater than Last element");
        } else {
            System.out.println("First element is Less than Last element");
        }
    }
}
