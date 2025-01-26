package lab8.problem5;

import lab8.problem2.Employee;
import lab8.problem2.NameComparator;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Examples {

    // A. (Employee e) -> e.getName()
    Function<Employee, String> getNameLambda = (Employee e) -> e.getName();
    Function<Employee, String> getNameMethodRef = Employee::getName; // Method reference type: Class::instanceMethod

    // B. (Employee e, String s) -> e.setName(s)
    BiConsumer<Employee, String> setNameLambda = (Employee e, String s) -> e.setName(s);
    BiConsumer<Employee, String> setNameMethodRef = Employee::setName; // Method reference type: Class::instanceMethod

    // C. (String s1, String s2) -> s1.compareTo(s2)
    BiFunction<String, String, Integer> compareToLambda = (String s1, String s2) -> s1.compareTo(s2);
    BiFunction<String, String, Integer> compareToMethodRef = String::compareTo; // Method reference type: Class::instanceMethod

    // D. (Integer x, Integer y) -> Math.pow(x, y)
    BiFunction<Integer, Integer, Double> powLambda = (Integer x, Integer y) -> Math.pow(x, y);
    BiFunction<Integer, Integer, Double> powMethodRef = Math::pow; // Method reference type: Class::staticMethod

    // E. (Apple a) -> a.getWeight()
    Function<Apple, Double> getWeightLambda = (Apple a) -> a.getWeight();
    Function<Apple, Double> getWeightMethodRef = Apple::getWeight; // Method reference type: Class::instanceMethod

    // F. (String x) -> Integer.parseInt(x)
    Function<String, Integer> parseIntLambda = (String x) -> Integer.parseInt(x);
    Function<String, Integer> parseIntMethodRef = Integer::parseInt; // Method reference type: Class::staticMethod

    // G. (Employee e1, Employee e2) -> comp.compare(e1, e2)
    NameComparator comp = new NameComparator();
    BiFunction<Employee, Employee, Integer> compareEmployeesLambda = (Employee e1, Employee e2) -> comp.compare(e1, e2);
    BiFunction<Employee, Employee, Integer> compareEmployeesMethodRef = comp::compare; // Method reference type: Object::instanceMethod

    // Evaluator method to test all the method references
    void evaluator() {
        // A. Test getName
        Employee emp = new Employee("John Edem", 50000);
        System.out.println(getNameMethodRef.apply(emp)); // Output: John

        // B. Test setName
        setNameMethodRef.accept(emp, "Davies");
        System.out.println(getNameMethodRef.apply(emp)); // Output: Doe

        // C. Test compareTo
        System.out.println(compareToMethodRef.apply("apple", "banana")); // Output: negative value

        // D. Test pow
        System.out.println(powMethodRef.apply(2, 3)); // Output: 8.0

        // E. Test getWeight
        Apple apple = new Apple(1.5);
        System.out.println(getWeightMethodRef.apply(apple)); // Output: 1.5

        // F. Test parseInt
        System.out.println(parseIntMethodRef.apply("123")); // Output: 123

        // G. Test compareEmployees
        Employee emp1 = new Employee("Alice", 60000);
        Employee emp2 = new Employee("Bob", 70000);
        System.out.println(compareEmployeesMethodRef.apply(emp1, emp2)); // Output depends on comparator logic
    }
}
