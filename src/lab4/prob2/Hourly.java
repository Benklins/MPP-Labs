package lab4.prob2;

import java.time.Month;
import java.time.Year;

public class Hourly extends Employee {

    private final double hourlyWage;

    private final int hoursPerWeek;

    private static final int WEEKS_PER_MONTH = 4;

    public Hourly(String empId, double hourlyWage, int hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }


    @Override
    public double calcGrossPay(Month month, Year year) {
        return hourlyWage * hoursPerWeek * WEEKS_PER_MONTH;
    }
}
