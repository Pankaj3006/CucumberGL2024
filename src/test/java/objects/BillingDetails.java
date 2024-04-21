package objects;

public class BillingDetails {

    private String firstname;
    private String lastname;
    private String country;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;

    public BillingDetails(String firstname, String lastname, String country, String address, String city, String state, String zip, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.country = country;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    }
