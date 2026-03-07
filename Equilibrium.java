public class Equilibrium {
    public static void main(String[] args) {
        int arr[] = {1,7,2,8,7,2,1};
        int totalsum = 0;
        for(int i=0;i<arr.length;i++){
            totalsum += arr[i];
        }
         int leftSum = 0;

        for(int i = 0; i < arr.length; i++) {

            int rightSum = totalsum - leftSum - arr[i];

            if(leftSum == rightSum) {
                System.out.println(i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.println("-1");
    }
}
