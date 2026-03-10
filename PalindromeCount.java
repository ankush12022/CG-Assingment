public class PalindromeCount {
    public static boolean isPalindrome(String word){
        int left = 0;
        int right = word.length() - 1;

        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int Count(String str){
        String arr[] = str.split(" ");
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(isPalindrome(arr[i])){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String str = "level is palindrome but naman";
        System.out.println(Count(str));
    }
}