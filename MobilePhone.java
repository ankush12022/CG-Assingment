

public class MobilePhone {

    static class Attributes{
        String brand;
        String model;
        double price;

        public Attributes(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        public void display(){
            System.out.println("Brand = "+brand);
            System.out.println("Model = "+model);
            System.out.println("Price = "+price);
        }
    }
    public static void main(String[] args) {
        Attributes ab = new Attributes("IPhone", "17 Pro Max",150000);
        ab.display();
    }
}
