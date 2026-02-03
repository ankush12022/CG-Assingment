import java.util.*;

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    Order placeOrder() {
        return new Order(this);
    }
}

class Order {
    Customer customer;
    List<Product> products = new ArrayList<>();

    Order(Customer customer) {
        this.customer = customer;
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        for (Product p : products)
            System.out.println(p.name + " " + p.price);
    }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
public class problem4 {
    public static void main(String[] args) {
        Customer c = new Customer("Ankush");
        Order o = c.placeOrder();

        o.addProduct(new Product("Laptop", 55000));
        o.addProduct(new Product("Mouse", 500));

        o.showOrder();
    }
}
