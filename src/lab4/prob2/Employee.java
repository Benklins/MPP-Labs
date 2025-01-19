package lab4.prob2;

import java.time.Month;
import java.time.Year;

public abstract class Employee {

    private final String empId;

    public Employee(String empId) {
        this.empId = empId;
    }


    public void print() {


        calCompensation(Month.JULY, Year.now()).print();

    }


    public abstract double calcGrossPay(Month month, Year year);

    public Paycheck calCompensation(Month month, Year year) {
        double grossPay = calcGrossPay(month, year);
        return new Paycheck(grossPay,
                Tax.FICA,
                Tax.State,
                Tax.Local,
                Tax.Medicare,
                Tax.SocialSecurity);
    }
}
