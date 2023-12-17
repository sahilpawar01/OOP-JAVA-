public class Publication {
    public String title;
    public double price;
    public int copies;

    // Default constructor to assign data members
    public Publication() {
        this.title = null;
        this.price = 0;
        this.copies = 0;
    }

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public void sellCopy(int qty) {
        System.out.println("Total publication sell: Rs." + (qty * price));
    }
}


