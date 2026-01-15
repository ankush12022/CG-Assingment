public class PalindromeTest {
    public static void main(String[] args) {

        PalindromeChecker pc = new PalindromeChecker("madam");
        pc.displayResult();
    }
}

class PalindromeChecker {

    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }
    public boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }
    }
}
