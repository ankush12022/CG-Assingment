public class repeatstring {
    public static String Repeat(String str,int times){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<times;i++){
            sb.append(str);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int times = 3;
        String str = "abc";
        System.out.println(Repeat(str, times));
    }
}
