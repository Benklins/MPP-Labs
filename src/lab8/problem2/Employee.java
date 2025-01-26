package lab8.problem2;

public class Employee {
    String name;
    int salary;

    public Employee(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "<" + "name: " +
                this.name +
                " salary: " +
                this.salary + ">";
    }
}
