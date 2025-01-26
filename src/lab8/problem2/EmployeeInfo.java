package lab8.problem2;

import java.util.List;

public class EmployeeInfo {
    SortMethod method;

    public EmployeeInfo(SortMethod method) {
        this.method = method;
    }

    public void sort(List<Employee> emps) {
        if (this.method == EmployeeInfo.SortMethod.BYNAME) {
            emps.sort(new NameComparator());
        } else if (this.method == EmployeeInfo.SortMethod.BYSALARY) {
            emps.sort(new SalaryComparator());
        }
    }


    static enum SortMethod {
        BYNAME, BYSALARY
    }
}
