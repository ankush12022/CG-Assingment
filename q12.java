import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.nextLine();
        str = str.replace(" ","-");
        System.out.println(str);
    }
}
