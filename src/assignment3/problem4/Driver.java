package assignment3.problem4;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {

        Property[] properties = {
                new House("1", new Address("", "Dallas", "55232", "Texas"), 1000),
                new Condominium("2", new Address("", "Austin", "55231", "Texas"), 50),
                new Trailer("3", new Address("", "Austin", "55233", "Texas"))};

        Admin admin = new Admin(Arrays.stream(properties).toList());
        double totalRent = admin.computeTotalRent();

        System.out.println(totalRent);
    }
}
