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
public class VisitorRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /*------------------- SQL Statements --------------------*/
    private static final String SQL_FIND_BY_ID ="select * from Visitor where phoneNumber=?";
    private static final String SQL_INSERT_INTO ="insert into Visitor(phoneNumber,visitorName,visitorEmail) values(?,?,?)";



    /*------------------- Retrive Statements --------------------*/
    @Transactional(readOnly=true)
    public Visitor findById(String id) {
        return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new VisitorRawMapper(), id);
    }

    /*------------------- Insert New Visitor --------------------*/
    public void insert(final Visitor visitor)
    {

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(SQL_INSERT_INTO, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, visitor.getPhoneNumber());
                ps.setString(2, visitor.getVisitorName());
                ps.setString(3, visitor.getVisitorEmail());
                return ps;
            }
        });


    }




}


