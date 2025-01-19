package lab4.prob2;

public class Paycheck {

    private final double grossPay;

    private final double fica;

    private final double state;

    private final double local;

    private final double medicare;

    private final double socialSecurity;

    public Paycheck(double grossPay, Tax fica, Tax state, Tax local, Tax medicare, Tax socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica.getVal();
        this.state = state.getVal();
        this.local = local.getVal();
        this.medicare = medicare.getVal();
        this.socialSecurity = socialSecurity.getVal();
    }


    public double getNetPay() {
        return grossPay - (grossPay * fica - grossPay * state - grossPay * local - grossPay * medicare - grossPay * socialSecurity);
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Gross Pay: ").append(grossPay).append("\n")
                .append("FICA: ").append(fica).append("\n")
                .append("State Tax: ").append(state).append("\n")
                .append("Local Tax: ").append(local).append("\n")
                .append("Medicare: ").append(medicare).append("\n")
                .append("Social Security: ").append(socialSecurity).append("\n")
                .append("Net Pay: ")
                .append(getNetPay() + "\n\n");
        return builder.toString();
    }
}
