package lab4.prob2;

import java.time.Month;
import java.time.Year;

public class Salaried extends Employee {

    private final double salary;


    public Salaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }


    @Override
    public double calcGrossPay(Month month, Year year) {
        return salary;
    }



}
