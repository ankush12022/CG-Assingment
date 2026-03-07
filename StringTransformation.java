public class StringTransformation {
    public static void main(String[] args) {
        String str = "aabbccaaddbbaafbb";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a'){
                sb.append('b');
            }else if(str.charAt(i) == 'b'){
                sb.append('a');
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
