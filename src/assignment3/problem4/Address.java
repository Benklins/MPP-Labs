package assignment3.problem4;

public class Address {


    private String street;

    private String city;

    private String zip;

    private String state;

    public Address(String street, String city, String zip, String state) {
        this.city = city;
        this.street = street;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }
}
