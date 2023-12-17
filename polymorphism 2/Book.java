
// Book.java
public class Book extends Publication {
    private String author;

    // Define constructor to assign data members
    public Book() {
        super();
        this.author = null;
    }

    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    // Method sellCopy() of superclass Publication is overridden
    public void sellCopy(int qty) {
        System.out.println("Total Book sell: Rs." + (qty * price));
    }
}

