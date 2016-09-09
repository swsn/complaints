package com.complaint;

/**
 * Created by amjadalmutairi on 8/16/16.
 */
public class Comment {


    //...............Attributes...............

    private int complaintId;
    private String employeeId;
    private String date;
    private String content;



    //...............Constructor...............
    public Comment() {
    }

    public Comment(int complaintId, String employeeId, String date, String content) {
        this.date = date;
        this.content = content;
        this.complaintId = complaintId;
        this.employeeId = employeeId;
    }

    //...............Setters and Getters...............
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {this.complaintId = complaintId;}

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
