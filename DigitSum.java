public class DigitSum {
    static int digitSum(int num){
        int sum = 0;
        while(num>0){
            sum += num%10;
            num /=10;
        }
        return sum;
    }

    public static int digitSumDifference(int m,int n){
        int sum4 = 0;
        int sum7 = 0;
        for(int i=m;i<=n;i++){
            if(i%4==0)
                sum4 += digitSum(i);

            if(i%7==0)
                sum7 += digitSum(i);
        }
        return Math.abs(sum4 - sum7);
    }

    public static void main(String[] args) {
        System.out.println(digitSumDifference(50,120));
    }
}