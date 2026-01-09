import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            c++;
        }
        System.out.println(c);
    }
}
