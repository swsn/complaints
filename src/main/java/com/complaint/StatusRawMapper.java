package com.complaint;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by amjadalmutairi on 8/16/16.
 */
public class StatusRawMapper implements RowMapper<Status>
{

    @Override
    public Status mapRow(ResultSet rs, int rowNum) throws SQLException {

        Status status = new Status();

        status.setComplaintId(rs.getInt("complaintId"));
        status.setEmployeeId(rs.getString("employeeId"));
        status.setDate(rs.getString("date"));
        status.setValue(rs.getBoolean("value"));

        return status;
    }
}
