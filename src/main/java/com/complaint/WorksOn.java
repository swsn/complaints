package com.complaint;

/**
 * Created by amjadalmutairi on 8/24/16.
 */
public class WorksOn {


    private String employeeId ;
    private int projectId ;


    public WorksOn(){}
    public WorksOn(String employeeId, int projectId) {
        this.employeeId = employeeId;
        this.projectId = projectId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
}
