package com.complaint;

/**
 * Created by amjadalmutairi on 8/16/16.
 */
public class Status {

    //...............Attributes...............
    private int complaintId;
    private String employeeId;
    private Boolean value;
    private String date;

    //...............Constructor...............
    public Status() { }

    public Status(int complaintId, String employeeId, Boolean value, String date) {
        this.complaintId = complaintId;
        this.employeeId = employeeId;
        this.value = value;
        this.date = date;
    }

    //...............Setters and Getters...............
    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
