public class Sumofprimeinrange {

    public static boolean Prime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int m =10;
        int n=50;

        int sum = 0;
        for(int i=m;i<n;i++){
            if(Prime(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
