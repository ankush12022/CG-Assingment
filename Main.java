interface Sum {
    int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        Sum sum = (a, b) -> a + b;

        // Calling the method
        int result = sum.add(10, 20);

        System.out.println("Sum = " + result);
    }
}
