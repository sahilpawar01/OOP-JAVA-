
// MainClass.java
public class MainClass {
    public static void main(String[] args) {
        Publication obj = new Publication("java", 200, 5);
        obj.sellCopy(2);

        Publication obj1 = new Book("java", 200, 5, "James Goalslin");
        obj1.sellCopy(3);

        Publication obj2 = new Magazine("java", 200, 5, 6, "sept");
        obj2.sellCopy(4);
    }
}
