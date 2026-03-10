import java.util.*;
public class removeDuplicateno {
    public static int[] Remove(int arr[]){
        HashSet<Integer> hs = new LinkedHashSet<>();
        for(int no : arr){
            hs.add(no);
        }
        int num[] = new int[hs.size()];
        int i = 0;
        for(int value : hs){
            num[i] = value;
            i++;
        }
        return num;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,10,3,3,4,5,6,7,8,96,98,5,1,58,69,5,4,8,5,5,4,5};
        System.out.println(Arrays.toString(Remove(arr)));
    }
}
