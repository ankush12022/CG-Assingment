public class Anagram {
    public static boolean check(String str, String str1){

        str = str.toLowerCase();
        str1 = str1.toLowerCase();
        int sum =0;
        int sum1=0;
        for(int i=0;i<str.length();i++){
            sum += str.charAt(i);
        }
        for(int i=0;i<str1.length();i++){
            sum1 += str1.charAt(i);
        }
        if(sum == sum1)
            return true;

        return false;
    }
    public static void main(String[] args) {
        String str = "naman";
        String str1 = "Naman";

        System.out.println(check(str, str1));
    }
}
