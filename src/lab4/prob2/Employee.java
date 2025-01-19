package lab4.prob2;

import java.time.Month;
import java.time.Year;

public abstract class Employee {

    private final String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee Id: " +empId;
    }

    public abstract double calcGrossPay(Month month, Year year);

    public Paycheck calCompensation(Month month, Year year) {
        double grossPay = calcGrossPay(month, year);
        return new Paycheck(grossPay,
                grossPay * 0.23,
                grossPay * 0.05,
                grossPay * 0.01,
                grossPay * 0.03,
                grossPay * 0.075);
    }
}
