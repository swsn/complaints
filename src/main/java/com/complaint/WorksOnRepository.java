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
 * Created by amjadalmutairi on 8/24/16.
 */

@Repository
public class WorksOnRepository {


    @Autowired
    private JdbcTemplate jdbcTemplate;


    /*------------------- SQL Statements --------------------*/
    private static final String SQL_INSERT_INTO ="insert into WorksOn(employeeId,projectId) values(?,?)";
    private static final String SQL_FIND_BY_EmployeeId = "select * from WorksOn where employeeId=?";
    private static final String SQL_FIND_BY_ProjectID = "select * from WorksOn where projectId=?";



     /*------------------- Retrive Statements --------------------*/
    @Transactional(readOnly=true)
    public int findProjectOfEmployeeId(String id) {
        WorksOn worksOn =  jdbcTemplate.queryForObject(SQL_FIND_BY_EmployeeId, new worksOnRawMapper() , id);
        System.out.print(worksOn.getProjectId());
        return worksOn.getProjectId();

    }

    @Transactional(readOnly=true)
    public List<WorksOn> findEmployeeOfProject(int id) {
        return jdbcTemplate.query(SQL_FIND_BY_ProjectID, new worksOnRawMapper() , id);
    }



    /*------------------- Assign employee to project --------------------*/
    public void insert(final WorksOn worksOn)
    {

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(SQL_INSERT_INTO, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, worksOn.getEmployeeId()) ;
                ps.setString(2, String.valueOf(worksOn.getProjectId()));

                return ps;
            }
        });



    }
}
