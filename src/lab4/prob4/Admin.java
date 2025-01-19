package lab4.prob4;


import java.util.ArrayList;
import java.util.List;

public class Admin {


    public Admin() {
    }

    public static double computeUpdatedBalanceSum(List<Employee> employees) {

        return employees.stream()
                .map(Employee::computeUpdatedBalanceSum)
                .reduce(0.0, Double::sum);

    }
}
