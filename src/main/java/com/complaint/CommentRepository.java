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
public class CommentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    /*------------------- SQL Statements ------------------- */
    private static final String SQL_FIND_BY_ComplaintID ="select * from Comment where complaintId=?";
    private static final String SQL_FIND_BY_EmployeeID_AND_ComplaintID ="select * from Comment where employeeId=? AND complaintId=?";
    private static final String SQL_INSERT_INTO ="insert into Comment(complaintId,employeeId,date,content) values(?,?,?,?)";


    /*------------------- Retrive Statements ------------------- */
    @Transactional(readOnly=true)
    public List<Comment> findByCompliantID(int id) {
        return jdbcTemplate.query(SQL_FIND_BY_ComplaintID, new CommentRawMapper(), id);
    }

    @Transactional(readOnly=true)
    public Comment findByEmployeeIDAndComplaintID(String employeeId , int compalintId) {
        return jdbcTemplate.queryForObject(SQL_FIND_BY_EmployeeID_AND_ComplaintID, new CommentRawMapper(), employeeId , compalintId);
    }



    /*------------------- Inset new comment ------------------- */
    public List<Comment> insert(final Comment comment)
    {

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(SQL_INSERT_INTO, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1,comment.getComplaintId());
                ps.setString(2,comment.getEmployeeId());
                ps.setString(3,comment.getDate());
                ps.setString(4,comment.getContent());
                return ps;
            }
        });

        return this.findByCompliantID(comment.getComplaintId());
    }



}
