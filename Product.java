public class Product{
    public static void main(String[] args) {
        Product11 pp = new Product11("Chawal", 100);
        pp.displaydetails();
    }
}

class Product11{
    String productname;
    double price;
    static int total = 0;

    Product11(String productname, double price){
        this.productname = productname;
        this.price = price;
        total++;
    }
    public void displaydetails(){
        System.out.println("Product Name = "+productname);
        System.out.println("Product Price = "+price);
        System.out.println("Total products = "+total);
    }
}