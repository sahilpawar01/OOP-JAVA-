public class Car implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int Gear) {
        gear = Gear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void statusDisplay() {
        System.out.println("Gear: " + gear + ", Speed: " + speed);
    }
}

