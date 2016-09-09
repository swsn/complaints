package com.complaint;



/**
 * Created by amjadalmutairi on 8/16/16.
 */
public class Complaint {



    //...............Attributes...............
    private int complaintId;
    private String date;
    private String type;
    private String title;
    private String content;
    private boolean isOpen;
    private boolean byVisitor;
    private String employeeID;
    private String visitorPhoneNumber;
    private int projectId;

    //...............Constructor...............
    public Complaint() { }

    public Complaint(int complaintId, String title, String content, String date, String type,
                     boolean isOpen, boolean byVisitor, String employeeID,
                     String visitorPhoneNumber, int projectId) {
        this.complaintId = complaintId;
        this.date = date;
        this.type = type;
        this.title = title;
        this.content = content;
        this.isOpen = isOpen;
        this.byVisitor = byVisitor;
        this.employeeID = employeeID;
        this.visitorPhoneNumber = visitorPhoneNumber;
        this.projectId = projectId;
    }

    //...............Setters and Getters...............
    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public boolean isByVisitor() {
        return byVisitor;
    }

    public void setByVisitor(boolean byVisitor) {
        this.byVisitor = byVisitor;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getVisitorPhoneNumber() {
        return visitorPhoneNumber;
    }

    public void setVisitorPhoneNumber(String visitorPhoneNumber) {
        this.visitorPhoneNumber = visitorPhoneNumber;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }



}
