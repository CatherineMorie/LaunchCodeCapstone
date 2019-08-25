package org.launchcode.LaunchCodeCapstone.dao;

import org.launchcode.LaunchCodeCapstone.models.Job;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JobRowMapper implements RowMapper<Job>{

    public Job mapRow(ResultSet resultSet, int ignoreThis) throws SQLException {
        String dateApplied;
        String companyName;
        String jobTitle;
        String jobReqNumber;
        int salary;
        String jobStatus;
        String jobDescription;

        dateApplied = resultSet.getString("date");
        companyName = resultSet.getString("company");
        jobTitle = resultSet.getString("title");
        jobReqNumber = resultSet.getString("req");
        salary = resultSet.getInt("salary");
        jobStatus = resultSet.getString("status");
        jobDescription = resultSet.getString("description");

        return new Job(dateApplied, companyName, jobTitle, jobReqNumber, salary, jobStatus, jobDescription);
    }

}
