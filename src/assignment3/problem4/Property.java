package assignment3.problem4;

public abstract class Property {


    private final String propertyId;

    private final Address address;


    public Property(String propertyId, Address address) {
        this.address = address;
        this.propertyId = propertyId;

    }

    public abstract double getRent();

    public Address getAddress() {
        return address;
    }

    public String getPropertyId() {
        return propertyId;
    }
}
