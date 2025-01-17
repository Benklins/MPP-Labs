package assignment3.problem2;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private List<Apartment> apartments;


    private double maintenanceCost;


    public Building(double maintenanceCost) {
        apartments = new ArrayList<>();
        this.maintenanceCost = maintenanceCost;

    }


    public List<Apartment> getApartments() {
        return apartments;
    }


    public double getRents() {

        double rents = 0.0;
        for (Apartment apartment : apartments) {
            rents += apartment.getRent();
        }
        return rents;
    }


    public double getMaintenanceCost() {
        return this.maintenanceCost;
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }


}
