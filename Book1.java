public class Book1 {

    static class Attributes{
        String title;
        double price;
        String author;

        Attributes(String title,String author,double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }
        public void display(){
            System.out.println(title);
            System.out.println(author);
            System.out.println(price);
        }
    }
    public static void main(String[] args) {
        Attributes at = new Attributes("The Devil", "Rohit" , 2000);
        at.display();
    }
}
