package org.launchcode.LaunchCodeCapstone.models;

public class Job {
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

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
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

    private String dateApplied;
    private String companyName;
    private String positionTitle;
    private String jobReqNumber;
    private int salary;
    private String jobStatus;
    //below items not yet included (stretch)
   /* private String positionDetails;
    private String userNotes; */

    public Job(String dateApplied, String companyName, String positionTitle, String jobReqNumber, int salary,
               String jobStatus) {
        this.dateApplied = dateApplied;
        this.companyName = companyName;
        this.positionTitle = positionTitle;
        this.jobReqNumber = jobReqNumber;
        this.salary = salary;
    }
}
