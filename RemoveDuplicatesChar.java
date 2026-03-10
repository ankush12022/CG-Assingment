import java.util.*;

public class RemoveDuplicatesChar {
    public static String Remove(String str){
        str = str.toLowerCase();
        Set<Character> set = new LinkedHashSet<>();

        for(char ch : str.toCharArray()){
            set.add(ch);
        }
        StringBuilder result = new StringBuilder();
        for(char ch : set){
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {

        String str = "Sharpshooter";
        System.out.println(Remove(str));
    }
}