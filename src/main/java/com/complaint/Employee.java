package com.complaint;

/**
 * Created by amjadalmutairi on 8/16/16.
 */
public class Employee {

    //...............Attributes...............
    private String employeeId;
    private String employeeName;
    private String position;
    private String email;

    //...............Constructor...............
    public Employee(){}

    public Employee(String employeeId, String employeeName, String position, String email) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.position = position;
        this.email = email;
    }

    //...............Setters and Getters...............
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getemployeeName() {
        return employeeName;
    }

    public void setemployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}