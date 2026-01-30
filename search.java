import java.util.Arrays;
import java.util.Random;

public class search {

    // Linear Search
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    // Binary Search
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int N = 1_000_000;   // dataset size
        int target = 999999;

        int[] arr = new int[N];
        Random rand = new Random();

        // Fill array with random numbers
        for (int i = 0; i < N; i++) {
            arr[i] = rand.nextInt(N);
        }

        // ---------------- Linear Search ----------------
        long startLinear = System.nanoTime();
        linearSearch(arr, target);
        long endLinear = System.nanoTime();

        long linearTime = endLinear - startLinear;

        // ---------------- Binary Search ----------------
        long startSort = System.nanoTime();
        Arrays.sort(arr); // sorting cost
        long endSort = System.nanoTime();

        long startBinary = System.nanoTime();
        binarySearch(arr, target);
        long endBinary = System.nanoTime();

        long sortTime = endSort - startSort;
        long binaryTime = endBinary - startBinary;

        // ---------------- Results ----------------
        System.out.println("Dataset size: " + N);
        System.out.println("Linear Search Time: " + linearTime + " ns");
        System.out.println("Sorting Time (Binary Search): " + sortTime + " ns");
        System.out.println("Binary Search Time: " + binaryTime + " ns");
        System.out.println("Total Binary Search Cost: " + (sortTime + binaryTime) + " ns");
    }
}
