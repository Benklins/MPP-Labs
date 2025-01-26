package lab8.problem2;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Joe", 100000));
        emps.add(new Employee("Tim", 50000));
        emps.add(new Employee("Andy", 60000));
        emps.add(new Employee("Joe", 70000)); // Duplicate name, different salary

        // Sort by name
        EmployeeInfo ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
        ei.sort(emps);
        System.out.println("Sorted by name: " + emps);

        // Sort by salary
        ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
        ei.sort(emps);
        System.out.println("Sorted by salary: " + emps);
    }
}
