import java.util.Scanner;

public class q6 {
    public static boolean check(String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <='z'){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String str = sc.nextLine().toLowerCase();

        System.out.println(check(str))
    }
}
