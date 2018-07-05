package hamxaproject.com.googlemapsgoogleplaces;

import android.content.Context;


/**
 * Created by HAmza on 14-Mar-18.
 */

public class User {
    private String name,email,mobile,cnic;

    public User()
    {
    }
    public User(String name, String email, String mobile, String cnic) {
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.cnic=cnic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String phone) {
        this.mobile = mobile;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }


    }

