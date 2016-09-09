package com.complaint;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.lang.Boolean.getBoolean;

/**
 * Created by amjadalmutairi on 8/16/16.
 */
public class ComplaintRawMapper implements RowMapper<Complaint> {
    @Override
    public Complaint mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        Complaint complaint = new Complaint();

        complaint.setComplaintId(rs.getInt("complaintId"));
        complaint.setTitle(rs.getString("title"));
        complaint.setContent(rs.getString("content"));
        complaint.setDate(rs.getString("date"));
        complaint.setType(rs.getString("type"));
        complaint.setOpen(rs.getBoolean("isOpen"));
        complaint.setByVisitor(rs.getBoolean("byVisitor"));
        complaint.setEmployeeID(rs.getString("employeeId"));
        complaint.setVisitorPhoneNumber(rs.getString("visitorPhoneNumber"));
        complaint.setProjectId(rs.getInt("projectId"));

        return complaint;
    }


}
