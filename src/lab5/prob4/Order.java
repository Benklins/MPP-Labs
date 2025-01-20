package lab5.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private final LocalDate orderDate;

    private final List<Item> orderItems;


    public Order(LocalDate orderDate) {
        this.orderDate = orderDate;
        orderItems = new ArrayList<>();
    }


    public void addItem(String name) {
        orderItems.add(CustOrderFactory.createItem(name));
    }

    @Override
    public String toString() {
        return orderDate + ": " +
                orderItems.toString();
    }
}
