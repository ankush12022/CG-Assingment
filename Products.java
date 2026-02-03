interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Products {
    private int productId;
    private String name;
    private double price;

    public Products(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    int getProductId() {
        return productId;
    }

    void setProductId(int productId) {
        this.productId = productId;
    }

    String getProductName() {
        return name;
    }

    void setProductName(String name) {
        this.name = name;
    }

    double getProductPrice() {
        return price;
    }

    void setProductPrice(double price) {
        this.price = price;
    }

    abstract double calculateDiscount();

    void display() {
        System.out.println("Product name: " + name);
        System.out.println("Product Id: " + productId);
        System.out.println("Price of the product: " + price);
    }
}

class Electronics extends Products implements Taxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return getProductPrice() * 0.15;
    }

    public double calculateTax() {
        return getProductPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "Electronics tax 18%";
    }
}
