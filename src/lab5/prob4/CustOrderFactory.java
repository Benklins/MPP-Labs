package lab5.prob4;

import java.time.LocalDate;

public class CustOrderFactory {


    public  Order createOrder(Customer customer, LocalDate orderDate) {

        if (orderDate == null || customer == null) throw new NullPointerException("Order Date or customer can't be null");
        Order order = new Order(orderDate);
        customer.addOrder(order);
        return order;
    }

    public  Customer createCustomer(String customerName) {
        if (customerName == null || customerName.isEmpty())
            throw new NullPointerException("Name can't be null or empty");
        return new Customer(customerName);
    }

    public  Item createItem(String itemName) {
        if (itemName == null || itemName.isEmpty()) throw new NullPointerException("Item name cant be null or empty");
        return new Item(itemName);
    }
}
