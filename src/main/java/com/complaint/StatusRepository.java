package com.complaint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by amjadalmutairi on 8/16/16.
 */

@Repository
public class StatusRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    /*------------------- SQL Statements --------------------*/
    private static final String SQL_FIND_BY_ComplaintID ="select * from Status where complaintId=?";
    private static final String SQL_FIND_BY_ComplaintID_AND_EmployeeID ="select * from Status where employeeId=? AND complaintId=?";
    private static final String SQL_INSERT_INTO ="insert into Status(complaintId,employeeId,date,value) values(?,?,?,?)";


     /*------------------- Retrive Statements --------------------*/
    @Transactional(readOnly=true)
    public List<Status> findByComplaintId(int id) {
        return jdbcTemplate.query(SQL_FIND_BY_ComplaintID, new StatusRawMapper(), id);
    }


    @Transactional(readOnly=true)
    public Status findByComplaintIdAndEmployeeId(String employeeId , int compliantId) {
        return jdbcTemplate.queryForObject(SQL_FIND_BY_ComplaintID_AND_EmployeeID, new StatusRawMapper(), employeeId , compliantId);
    }

    /*------------------- Insert New Status --------------------*/
    public Status insert(final Status status)
    {

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(SQL_INSERT_INTO, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, status.getComplaintId());
                ps.setString(2,status.getEmployeeId());
                ps.setString(3,status.getDate());
                ps.setBoolean(4, status.getValue());
                return ps;
            }
        });

        return findByComplaintIdAndEmployeeId(status.getEmployeeId(), status.getComplaintId());
    }


}
