package dao;

import org.launchcode.LaunchCodeCapstone.models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class JobDAO {


    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Job> getAll() {
        return jdbcTemplate.query("select * from jobs.applied", new JobRowMapper());
    }

    public class JobRowMapper implements RowMapper<Job> {

        @Override
        public Job mapRow(ResultSet resultSet, int i) throws SQLException {
            return null;
        }
    }
}
