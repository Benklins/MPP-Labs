package lab8.problem1.biii;

import java.util.function.Supplier;

public class Main {


    static class RandomSupplier implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }

    public static void main(String[] args) {

        Supplier<Double> randomSupplier = new RandomSupplier();
        System.out.println("Random number (inner class): " + randomSupplier.get());
    }
}
