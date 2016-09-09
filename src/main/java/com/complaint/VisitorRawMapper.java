package com.complaint;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by amjadalmutairi on 8/16/16.
 */
public class VisitorRawMapper implements RowMapper<Visitor> {

    @Override
    public Visitor mapRow(ResultSet rs, int rowNum) throws SQLException {
        Visitor visitor = new Visitor();
        visitor.setPhoneNumber(rs.getString("phoneNumber"));
        visitor.setVisitorName(rs.getString("visitorName"));
        visitor.setVisitorEmail(rs.getString("visitorEmail"));
        return visitor;
    }
}
