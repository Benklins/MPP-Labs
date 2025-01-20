package lab5.prob3;

public class Rectangle implements IShape {

    private final double width;

    private final double length;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double computeArea() {
        return width * length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
