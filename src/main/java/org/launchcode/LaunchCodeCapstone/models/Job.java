package org.launchcode.LaunchCodeCapstone.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Job {
    private int id;
    private String dateApplied;
    private String companyName;
    private String jobTitle;
    private String jobReqNumber;
    private int salary;
    private String jobStatus;
    private String jobDescription;

    public Job(int id, String dateApplied, String companyName, String jobTitle, String jobReqNumber, int salary,
               String jobStatus, String jobDescription) {
        this.id = id;
        this.dateApplied = dateApplied;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.jobReqNumber = jobReqNumber;
        this.salary = salary;
        this.jobStatus = jobStatus;
        this.jobDescription = jobDescription;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(String dateApplied) {
        this.dateApplied = dateApplied;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String positionTitle) {
        this.jobTitle = positionTitle;
    }

    public String getJobReqNumber() {
        return jobReqNumber;
    }

    public void setJobReqNumber(String jobReqNumber) {
        this.jobReqNumber = jobReqNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getJobDescription() { return jobDescription; }

    public void setJobDescription(String jobDescription) { this.jobDescription = jobDescription; }

}
