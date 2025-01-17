package assignment3.problem4;

public class House extends Property {

    private final double lotSize;

    public House(String propertyId, Address address, double lotSize) {
        super(propertyId, address);
        this.lotSize = lotSize;
    }


    @Override
    public double getRent() {
        return 0.1 * lotSize;
    }


    public double getLotSize() {
        return lotSize;
    }
}
