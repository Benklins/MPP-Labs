package assignment3.problem3.composition;

public class Cylinder {

    private final Circle cylinderBase;

    private final double cylinderHeight;


    public Cylinder(Circle base, int height) {
        if (base == null) {
            throw new IllegalArgumentException("Base cannot be null");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        cylinderBase = base;
        cylinderHeight = height;
    }


    public double computeVolume() {
        return cylinderBase.computeArea() * cylinderHeight;
    }
}
