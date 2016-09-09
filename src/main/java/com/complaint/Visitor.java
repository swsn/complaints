package com.complaint;

/**
 * Created by amjadalmutairi on 8/16/16.
 */
public class Visitor {

    //...............Attributes...............
    private String phoneNumber;
    private String visitorName;
    private String visitorEmail;



    //...............Constructor...............
    public Visitor() { }

    public Visitor(String phoneNumber, String visitorName, String visitorEmail) {
        this.phoneNumber = phoneNumber;
        this.visitorName = visitorName;
        this.visitorEmail = visitorEmail;
    }

   //.............Setters and Getters...............
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) { this.visitorName = visitorName; }

    public String getVisitorEmail() {
        return visitorEmail;
    }

    public void setVisitorEmail(String visitorEmail) {
        this.visitorEmail = visitorEmail;
    }
}
