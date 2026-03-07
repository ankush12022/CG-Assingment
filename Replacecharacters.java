public class Replacecharacters {

    public static String replace(String str, char ch1, char ch2) {

        char arr[] = str.toCharArray();

        for(int i=0;i<arr.length;i++){

            if(arr[i] == ch1)
                arr[i] = ch2;

            else if(arr[i] == ch2)
                arr[i] = ch1;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        System.out.println(replace("apples",'a','p'));
    }
}