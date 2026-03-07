public class Parkinglot {

    public static int maxCars(String arr) {
        int count = 0;

        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == 'S') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String arr = "XXXSXXSXXSSXXSXX";
        System.out.println(maxCars(arr));
    }
}