package assignment3.problem4;

public class Trailer extends Property {


    public Trailer(String propertyId, Address trailerParkerAddress) {
        super(propertyId, trailerParkerAddress);
    }


    @Override
    public double getRent() {
        return 500;
    }
}
