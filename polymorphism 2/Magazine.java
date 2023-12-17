

// Magazine.java
public class Magazine extends Publication {
    private int orderQty;
    private String currIssue;

    // Define Constructor to assign data members
    public Magazine(String title, double price, int copies, int orderQty, String currIssue) {
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currIssue = currIssue;
    }

    // Method sellCopy() of superclass Publication is overridden
    public void sellCopy(int qty) {
        System.out.println("Total Magazine sell: Rs." + (qty * price));
    }
}

