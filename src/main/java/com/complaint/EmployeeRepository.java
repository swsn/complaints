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
import com.complaint.EmployeeRawMapper;

/**
 * Created by amjadalmutairi on 8/16/16.
 */
@Repository
public class EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /*------------------- SQL Statements --------------------*/
    private static final String SQL_FIND_BY_ID ="select * from Employee where employeeId=?";
    private static final String SQL_INSERT_INTO ="insert into Employee(employeeId,employeeName,position,employeeEmail)values(?,?,?,?)";


    /*------------------- Retrive Statements --------------------*/
    @Transactional(readOnly=true)
    public Employee findById(String id) {
        return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new EmployeeRawMapper(), id);
    }


    /*------------------- Insert New Employee --------------------*/
    public void insert(final Employee employee)
    {
        jdbcTemplate.update(new PreparedStatementCreator()
        {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(SQL_INSERT_INTO, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, employee.getEmployeeId());
            ps.setString(2, employee.getemployeeName());
            ps.setString(3, employee.getPosition());
            ps.setString(4, employee.getEmail());
            return ps;
            }
        });


    }


}
