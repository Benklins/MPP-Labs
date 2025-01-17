package assignment3.problem2;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Apartment[] apts0 = {
                new Apartment(600),
                new Apartment(700)};
        Apartment[] apts1 = {
                new Apartment(500),
                new Apartment(450)
        };
        Apartment[] apts2 = {
                new Apartment(1100),
                new Apartment(650)};

        Apartment[] apts3 = {
                new Apartment(6750),
                new Apartment(945)
        };
        Building[] bldgs = {
                new Building(600),
                new Building(900),
                new Building(300),
                new Building(775)
        };
        for (Apartment a : apts0) {
            bldgs[0].addApartment(a);
        }
        for (Apartment a : apts1) {
            bldgs[1].addApartment(a);
        }
        for (Apartment a : apts2) {
            bldgs[2].addApartment(a);
        }
        for (Apartment a : apts3) {
            bldgs[3].addApartment(a);
        }

        Landlord landlord = new Landlord(Arrays.stream(bldgs).toList());

        System.out.println(landlord.calProfits());

    }


}


