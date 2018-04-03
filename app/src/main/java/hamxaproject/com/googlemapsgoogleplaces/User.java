package hamxaproject.com.googlemapsgoogleplaces;

/**
 * Created by HAmza on 14-Mar-18.
 */

public class User {
    private String email, name,address,cnic;
    public User()
    {
    }
    public User(String email, String name, String address, String cnic) {
        this.email=email;
        this.name=name;
        this.address=address;
        this.cnic=cnic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.address = phone;
    }
    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }
}
