package com.complaint;

/**
 * Created by amjadalmutairi on 8/16/16.
 */
public class Project {


    //...............Attributes...............
    private int projectId;
    private String name;
    private String city ;
    private String branch;
    private String branchManager ;
    private String regionalDirector ;

    //...............Constructor...............
    public Project() { }

    public Project(int projectId, String name, String city, String branch, String branchManager, String regionalDirector) {
        this.projectId = projectId;
        this.name = name;
        this.city = city;
        this.branch = branch;
        this.branchManager = branchManager;
        this.regionalDirector = regionalDirector;
    }

    //.............setters and getters...............

    public int getId() {
        return projectId;
    }

    public void setId(int id) {
        this.projectId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


    public String getBranchManager() {
        return branchManager;
    }

    public void setBranchManager(String branchManager) {
        this.branchManager = branchManager;
    }

    public String getRegionalDirector() {
        return regionalDirector;
    }

    public void setRegionalDirector(String regionalDirector) {
        this.regionalDirector = regionalDirector;
    }
}
