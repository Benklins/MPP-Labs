package assignment3.problem3.composition;

public class Circle {

    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }


    public double computeArea() {

        return Math.PI * Math.pow(radius, 2);
    }
}
