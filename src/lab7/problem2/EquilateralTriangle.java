package lab7.problem2;

public class EquilateralTriangle implements Polygon{
    private final double sideLength;

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double[] getSides() {
        return new double[]{sideLength, sideLength, sideLength};
    }
}
