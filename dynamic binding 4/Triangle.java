public class Triangle extends Shape {
    // @Override
    public double compute_area() {
        // No need to explicitly get height and width, as they are already set in the
        // input method
        return (height * width) / 2;
    }
}