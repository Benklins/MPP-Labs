package lab5.prob3;

public class Triangle implements IShape {

    private final double base;

    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;

    }


    public double computeArea() {
        return 0.5 * height * base;
    }
}
