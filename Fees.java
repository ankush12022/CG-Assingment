public class Fees {
    public static void main(String[] args) {
        // Given values
        double fee = 125000;
        double discountPercent = 10;

        double discount = (fee * discountPercent) / 100;
        double discountedFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount 
                + " and final discounted fee is INR " + discountedFee);
    }
}
