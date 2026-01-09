import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : arr){
            StringBuilder rv = new StringBuilder(word);
            sb.append(rv.reverse().append(" "));
        }
        System.out.println(sb.toString().trim());
    }
}
