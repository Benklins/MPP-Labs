package assignment3.problem4;

public class Condominium extends Property {


    private final int numberOfFloors;

    public Condominium(String propertyId, Address address, int numberOfFloors) {
        super(propertyId, address);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public double getRent() {
        return 400 * numberOfFloors;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }
}
