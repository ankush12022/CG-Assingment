public class profit {
    public static void main(String[] args) {
     //Input
    int costprice = 129;
    int sellingprice = 191;
    int profit = sellingprice - costprice;
    
    int percentage = (int) ((profit / (double) costprice) * 100);
    
    // Output
    System.out.println("The Cost Price is INR "+ costprice +" and Selling Price is INR " + sellingprice + 
                " .The Profit is INR "+ profit+" and the Profit Percentage is "+ percentage );
    }
}
