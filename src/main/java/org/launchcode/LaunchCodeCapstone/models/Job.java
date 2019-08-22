package org.launchcode.LaunchCodeCapstone.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Job {
    private String dateApplied;
    private String companyName;
    private String jobTitle;
    private String jobReqNumber;
    private int salary;
    private String jobStatus;
    //below items not yet included (stretch)
   /* private String positionDetails; -- text area
    private String userNotes; -- text area*/

    public Job(String dateApplied, String companyName, String jobTitle, String jobReqNumber, int salary,
               String jobStatus) {
        this.dateApplied = dateApplied;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.jobReqNumber = jobReqNumber;
        this.salary = salary;
        this.jobStatus = jobStatus;
    }

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

}
