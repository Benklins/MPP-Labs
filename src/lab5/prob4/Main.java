package lab5.prob4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//        CustOrderFactory custOrderFactory = new PremiumCustomerFactory(CustomerType.PREMIUM);
//        custOrderFactory.createCustomer("John");
//
//
//       Customer cust =  custOrderFactory.createCustomer("John");
//        Order order = custOrderFactory.createOrder(cust, LocalDate.now());
//
//        order.addItem(custOrderFactory.createItem("Shirt"));
//        order.addItem(custOrderFactory.createItem("Laptop"));
//
//        order = custOrderFactory.createOrder(cust, LocalDate.now());
//        order.addItem(custOrderFactory.createItem("Pants"));
//        order.addItem(custOrderFactory.createItem("Knife set"));
//

        B o1 = new B();
        int r = o1.getValue();
        o1.print();


        A o2 = new B();
        o2.print();

        A o3 = new A(3);
        o3.print();
        int k = o3.getValue();

        for(int i = 0; i < k ; i++){
            o3.print();
        }

//        System.out.println(cust.getOrders());
    }
}


