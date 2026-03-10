class RAT{
    public static int Chuha(int[] arr,int r,int unit){

        if(arr == null) return -1;

        int food = r * unit;
        int house = arr[0];
        int c = 1;

        for(int i = 1; i < arr.length; i++){

            if(house >= food)
                return c;

            house += arr[i];
            c++;
        }

        if(house >= food)
            return c;

        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {7,8,3,5,1,4,2,15};
        int r = 7;
        int unit = 2;

        System.out.println(Chuha(arr,r,unit));
    }
}