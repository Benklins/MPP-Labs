package lab5.prob4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer cust = CustOrderFactory.createCustomer("Bob");
        Order order = CustOrderFactory.createOrder(cust, LocalDate.now());
        order.addItem("Shirt");
        order.addItem("Laptop");

        order = CustOrderFactory.createOrder(cust, LocalDate.now());
        order.addItem("Pants");
        order.addItem("Knife set");

        System.out.println(cust.getOrders());
    }
}

		
