package lab7.problem2;

public class Ellipse implements ClosedCurve{
    private final double semiMajorAxis;
    private final double ellipticIntegral;

    public Ellipse(double semiMajorAxis, double ellipticIntegral) {
        this.semiMajorAxis = semiMajorAxis;
        this.ellipticIntegral = ellipticIntegral;
    }
    @Override
    public double computePerimeter() {
        return 4 * semiMajorAxis * ellipticIntegral;
    }
}
