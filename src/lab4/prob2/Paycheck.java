package lab4.prob2;

public class Paycheck {

    private final double grossPay;

    private final double fica;

    private final double stateTax;

    private final double localTax;

    private final double medicare;

    private final double socialSecurity;

    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.stateTax = state;
        this.localTax = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }


    public double getNetPay() {
        return grossPay - (fica - stateTax - localTax - medicare - socialSecurity);
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Gross Pay: ").append(grossPay).append("\n")
                .append("FICA: ").append(fica).append("\n")
                .append("State Tax: ").append(stateTax).append("\n")
                .append("Local Tax: ").append(localTax).append("\n")
                .append("Medicare: ").append(medicare).append("\n")
                .append("Social Security: ").append(socialSecurity).append("\n")
                .append("Net Pay: ")
                .append(getNetPay() + "\n\n");
        return builder.toString();
    }
}
