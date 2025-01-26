package lab8.problem1.bi;

import java.util.function.Supplier;

public class Main {

    public static  void main(String[] args){


        Supplier<Double> randomSupplier  = () -> Math.random();


        System.out.println("Random number: " + randomSupplier.get());
    }
}
