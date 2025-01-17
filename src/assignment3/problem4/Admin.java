package assignment3.problem4;


import java.util.List;

public class Admin {

    private List<Property> properties;


    Admin(List<Property> properties) {
        this.properties = properties;
    }


    public double computeTotalRent() {
        double totalRent = 0;

        for (Property property : properties) {
            totalRent+=property.getRent();
        }
        return totalRent;
    }


}
