import java.util.Scanner;


public abstract class Shape {
    double height, width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height:");
        height = sc.nextDouble();
        System.out.println("Enter width:");
        width = sc.nextDouble();
    }

    public abstract double compute_area();
}

