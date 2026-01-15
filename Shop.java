public class Shop {

    static class Item{
        int itemcode;
        String itemname;
        double price;
        int quantity;

        public Item(int itemcode, String itemname, double price,int quantity) {
            this.itemcode = itemcode;
            this.itemname = itemname;
            this.price = price;
            this.quantity = quantity;
        }
        public void display(){
            System.out.println("Item Code = "+itemcode);
            System.out.println("Item Name = "+itemname);
            System.out.println("Item Price = "+price);
            System.out.println("Total cost = "+totalprice(quantity));
        }
        public double totalprice(double quantity){
            return (quantity * price);
        }
    }
    public static void main(String[] args) {
        Item it = new Item(01, "Chawal", 2100, 2);
        it.display();
    }
}
