package lab4.prob2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order("01231", LocalDate.now(), 100),
                new Order("01231",
                        LocalDate.of(Year.now().getValue(),
                                Month.JULY, 1),
                        200));

        Employee salariedEmployee = new Salaried("100181", 15000);
        Employee hourlyEmployee = new Hourly("H1005623", 60, 40);
        Employee commissionedEmployee = new Commissioned("CO100456", 5000, orders, 0.1);


        salariedEmployee.calCompensation(Month.JULY, Year.now()).print();
        hourlyEmployee.calCompensation(Month.JULY, Year.now()).print();
        commissionedEmployee.calCompensation(Month.JULY, Year.now()).print();
        System.out.println(salariedEmployee);
        System.out.println(hourlyEmployee);
        System.out.println(commissionedEmployee);

    }
}
;