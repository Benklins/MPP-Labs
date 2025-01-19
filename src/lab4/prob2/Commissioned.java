package lab4.prob2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.List;

public class Commissioned extends Employee {


    private final double baseSalary;

    private final List<Order> orders;

    private final double commission;


    public Commissioned(String empId, double baseSalary, List<Order> orders, double commission) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = orders;
    }


    @Override
    public double calcGrossPay(Month month, Year year) {
        double totalOrderAmount = getOrdersByDate(month, year)
                .stream()
                .map(Order::getOrderAmount)
                .reduce(0.0, Double::sum);
        return baseSalary + (commission * totalOrderAmount);
    }


    private List<Order> getOrdersByDate(Month month, Year year) {

        return orders.stream().filter((order) -> {
            LocalDate orderDate = order.getOrderDate();
            return orderDate.getMonth().equals(month) && orderDate.getYear() == year.getValue();
        }).toList();
    }


    public void addNewOrder(String orderNum, LocalDate orderDate, double orderAmount) {
        orders.add(new Order(orderNum, orderDate,  orderAmount));
    }

}
