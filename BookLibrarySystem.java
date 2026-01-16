public class BookLibrarySystem {
    public static void main(String[] args) {

        EBook ebook = new EBook(12345, "Java Programming", "James Gosling", "PDF");

        ebook.displayDetails();
        ebook.setAuthor("Oracle Corporation");

        System.out.println("\nAfter Updating Author:");
        System.out.println("Author: " + ebook.getAuthor());
    }
}

class Book {
    public int ISBN;           
    protected String title;    
    private String author;   

    public Book(int ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {

    String format;

    public EBook(int ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    public void displayDetails() {
        System.out.println("ISBN   : " + ISBN);      // public → accessible
        System.out.println("Title  : " + title);     // protected → accessible
        System.out.println("Format : " + format);
        System.out.println("Author : " + getAuthor()); // private → via getter
    }
}
