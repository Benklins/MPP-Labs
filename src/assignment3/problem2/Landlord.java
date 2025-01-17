package assignment3.problem2;

import java.util.List;
import java.util.concurrent.atomic.DoubleAdder;

public class Landlord {

    private final List<Building> buildings;


    public Landlord(List<Building> buildings) {
        this.buildings = buildings;
    }


    public List<Building> getBuildings() {
        return buildings;
    }


    public void addBuilding(Building building) {
        buildings.add(building);
    }


    public double calProfits() {

        double totalRent = 0.0;
        double totalMaintenanceCost = 0.0;

        for (Building building : buildings) {
            totalMaintenanceCost += building.getMaintenanceCost();
            totalRent += building.getRents();
        }

        return totalRent - totalMaintenanceCost;

    }

}
