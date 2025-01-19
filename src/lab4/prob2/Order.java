package lab4.prob2;

import java.time.LocalDate;

public class Order {

    private final String orderNo;

    private final LocalDate orderDate;

    private final double orderAmount;


    public Order(String orderNo, LocalDate orderDate, double orderAmount) {

        this.orderAmount = orderAmount;
        this.orderDate = orderDate;
        this.orderNo = orderNo;

    }

    public String getOrderNo() {
        return orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}
