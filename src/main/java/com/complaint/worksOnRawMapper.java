package com.complaint;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by amjadalmutairi on 8/24/16.
 */
public class worksOnRawMapper implements RowMapper<WorksOn> {

    @Override
    public WorksOn mapRow(ResultSet rs, int rowNum) throws SQLException {
        WorksOn worksOn = new WorksOn();
        worksOn.setEmployeeId(rs.getString("employeeId"));
        worksOn.setProjectId(rs.getInt("projectId"));

        return worksOn;
    }
}
