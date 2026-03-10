public class StringZeroandOnes {
    
    public static String Word(String str){
        String[] arr = str.split("0");
        StringBuilder result = new StringBuilder();

        for(String s : arr){
            int length = s.length();
            char ch = (char)('A' + length - 1);
            result.append(ch);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "11011011101111";
        System.out.println(Word(str));
    }
}
