public class InterfaceDemo {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.changeGear(3);
        b.speedUp(2);
        b.applyBrakes(1);
        System.out.println("Bicycle state:");
        b.statusDisplay();

        Bike bk = new Bike();
        bk.changeGear(4);
        bk.speedUp(3);
        bk.applyBrakes(2);
        System.out.println("Bike state:");
        bk.statusDisplay();

        Car c = new Car();
        c.changeGear(5);
        c.speedUp(3);
        c.applyBrakes(1);
        System.out.println("Car state:");
        c.statusDisplay();
    }
}
