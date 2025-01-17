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

            if (property instanceof House house) {
                totalRent += house.getRent();

            } else if (property instanceof Condominium condominium) {
                totalRent += condominium.getRent();

            } else if (property instanceof Trailer trailer) {
                totalRent += trailer.getRent();

            }
        }
        return totalRent;
    }




}
