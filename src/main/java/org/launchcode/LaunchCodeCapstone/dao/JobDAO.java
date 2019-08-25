package org.launchcode.LaunchCodeCapstone.dao;

import org.launchcode.LaunchCodeCapstone.models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JobDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Job> getAll() {
        return jdbcTemplate.query("select * from jobs.applied",
                new JobRowMapper());
    }

    public void addJob(Job job){

        System.out.println("Inserting " + job);

        jdbcTemplate.update(

                "INSERT INTO jobs.applied(date, company, title, req, salary, status) " +
                        "VALUES (?,?, ?, ?, ?, ?)",

                job.getDateApplied(), job.getCompanyName(), job.getJobTitle(), job.getJobReqNumber(), job.getSalary(),
                job.getJobStatus());
    }

    public void updateJob(Job job){
        System.out.println("Updating " + job);
        jdbcTemplate.update(
                "UPDATE jobs.applied SET date=?, company=?, title=?, req=?, salary=?, status=? where id=?",
                job.getDateApplied(), job.getCompanyName(), job.getJobTitle(), job.getJobReqNumber(),
                job.getSalary(), job.getJobStatus());
    }

    public Job findById(int id){

        List<Job> matches = jdbcTemplate.query("select * from jobs.applied where id = ?",
                new Object[]{id}, new JobRowMapper());
        if (matches.isEmpty()){
            return null;
        }
        else {
            return matches.get(0);
        }
    }
}
