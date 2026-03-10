public class Maxoccuringcharacter {
    public static Character Ouccuring(String str){
        int maxcount = Integer.MIN_VALUE;
        char maxchar = ' ';
        for(int i =0;i<str.length();i++){
            int count =0;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count > maxcount){
                maxcount = count;
                maxchar = str.charAt(i);
            } 
        }
        return maxchar;
    }
    public static void main(String[] args) {
        String str = "aabbccddfffffggggghhhhh";
        System.out.println(Ouccuring(str));
    }
}
