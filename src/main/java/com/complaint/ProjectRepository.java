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
import java.util.Map;

/**
 * Created by amjadalmutairi on 8/16/16.
 */

@Repository
public class ProjectRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    /*------------------- SQL Statements --------------------*/
    private static final String SQL_FIND_BY_ID ="select * from Project where projectId=?";
    private static final String SQL_INSERT_INTO ="insert into Project(projectId,name,city,branch,branchManager,regionalDirector) values (?,?,?,?,?,?)";
    private static final String SQL_FIND_BY_RegionalDirector ="select * from Project where regionalDirector=?";
    private static final String SQL_FIND_BY_BranchManager ="select * from Project where branchManager=?";
    private static final String SQL_FIND_The_RegionalDirector ="select * from Project where city=?";


    /*------------------- Retrive Statements --------------------*/
    @Transactional(readOnly=true)
    public Project findById(int id) {
        return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new ProjectRawMapper(), id);
    }

    @Transactional(readOnly=true)
    public List<Project> findByRegionalDirector(String regionalDirector) {

        return jdbcTemplate.query(SQL_FIND_BY_RegionalDirector, new ProjectRawMapper(), regionalDirector);
    }

    @Transactional(readOnly=true)
    public Project findByBranchManager(String branchManager) {
        return jdbcTemplate.queryForObject(SQL_FIND_BY_BranchManager, new ProjectRawMapper(), branchManager);
    }



    @Transactional(readOnly=true)
    public String  findTheRegionalDirector(String region) {

        List<Project> result = jdbcTemplate.query(SQL_FIND_The_RegionalDirector, new ProjectRawMapper(), region);

        return String.valueOf(result.get(0).getRegionalDirector());
    }


    /*------------------- Insert New Project --------------------*/
    public void insert(final Project project) throws SQLException
    {
        jdbcTemplate.update(new PreparedStatementCreator()
        {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(SQL_INSERT_INTO, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, project.getId());
                ps.setString(2, project.getName());
                ps.setString(3, project.getCity());
                ps.setString(4, project.getBranch());
                ps.setString(5, project.getBranchManager());
                ps.setString(6, project.getRegionalDirector());
                return ps;
            }
        });


    }



}
