package ecom.com.model;

public class Address  {
    private String residentialAddress;
    private String postalCode;
    private String state;
    private String country;

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residential_address) {
        this.residentialAddress = residential_address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
