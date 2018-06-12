package com.example.utkarshyadavin.petrolpump;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by utkarshyadavin on 12/6/18.
 */

public class Address {

    @SerializedName("hashkey")
    @Expose
    private String HashKey;
    @SerializedName("street")
    @Expose
    private String Street;
    @SerializedName("country")
    @Expose
    private String Country;
    @SerializedName("pincode")
    @Expose
    private String Pincode;
    @SerializedName("mobile")
    @Expose
    private String Mobile;
    @SerializedName("city")
    @Expose
    private String City;
    @SerializedName("lastname")
    @Expose
    private String LastName;
    @SerializedName("email")
    @Expose
    private String Email;
    @SerializedName("customer_id")
    @Expose
    private String CustomerId;
    @SerializedName("state")
    @Expose
    private String State;
    @SerializedName("firstname")
    @Expose
    private String FirstName;
    @SerializedName("gmap_lng")
    @Expose
    private String Gmap_Lng;
    @SerializedName("gmap_lat")
    @Expose
    private String Gmap_Lat;
    @SerializedName("gmap_plus_code")
    @Expose
    private String Gmam_Plus;

    public void setHashKey(String hashKey) {
        HashKey = hashKey;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setPincode(String pincode) {
        Pincode = pincode;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public void setStats(String state) {
        State = state;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setGmap_Lng(String gmap_Lng) {
        Gmap_Lng = gmap_Lng;
    }

    public void setGmap_Lat(String gmap_Lat) {
        Gmap_Lat = gmap_Lat;
    }

    public void setGmam_Plus(String gmam_Plus) {
        Gmam_Plus = gmam_Plus;
    }

    public String getHashKey() {

        return HashKey;
    }

    public String getStreet() {
        return Street;
    }

    public String getCountry() {
        return Country;
    }

    public String getPincode() {
        return Pincode;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getCity() {
        return City;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public String getState() {
        return State;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getGmap_Lng() {
        return Gmap_Lng;
    }

    public String getGmap_Lat() {
        return Gmap_Lat;
    }

    public String getGmam_Plus() {
        return Gmam_Plus;
    }
}
