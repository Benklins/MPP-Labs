package lab8.problem2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int salaryComparison = Double.compare(e1.salary, e2.salary);
        if (salaryComparison != 0) {
            return salaryComparison;
        }
        return e1.name.compareTo(e2.name);
    }
}

