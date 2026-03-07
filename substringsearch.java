public class substringsearch {

    public static int findIndex(String str1, String str2) {

        return str1.indexOf(str2);
    }

    public static void main(String[] args) {

        String str1 = "Hello, World!";
        String str2 = "World";

        System.out.println(findIndex(str1,str2));
    }
}