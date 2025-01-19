package lab4.prob2;

public enum Tax {
    FICA(0.23),
    State(0.05),
    Local(0.01),
    Medicare(0.03),
    SocialSecurity(0.075);

    private final double val;

     Tax(double val) {
        this.val = val;
    }

    public double getVal() {
        return this.val;
    }
}