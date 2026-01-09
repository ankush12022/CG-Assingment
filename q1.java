import java.util.*;

class q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.nextLine();
        int c =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                c++;
            }
        }
        System.out.println("Number vowels in a string " +c);
    }
}