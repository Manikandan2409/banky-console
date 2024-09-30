package banky.entity.users;

public class Information {
    private String username;
    public Information(String username, String address, String location, String pincode) {
        this.username = username;
        this.address = address;
        this.location = location;
        this.pincode = pincode;
    }
    private String address;
    private String location;
    private String pincode;

    public String getUsername() {
        return username;
    }
    public String getAddress() {
        return address;
    }
    public String getLocation() {
        return location;
    }
    public String getPincode() {
        return pincode;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    @Override
    public String toString() {
        return "Information [username=" + username + ", address=" + address + ", location=" + location + ", pincode="
                + pincode + "]";
    }
}
