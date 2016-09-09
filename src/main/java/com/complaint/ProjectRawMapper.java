package com.complaint;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by amjadalmutairi on 8/16/16.
 */
public class ProjectRawMapper implements RowMapper<Project>
{

    @Override
    public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
        Project project = new Project();
        project.setId(rs.getInt("projectId"));
        project.setName(rs.getString("name"));
        project.setCity(rs.getString("city"));
        project.setBranch(rs.getString("branch"));
        project.setBranchManager(rs.getString("branchManager"));
        project.setRegionalDirector(rs.getString("regionalDirector"));
        return project;
    }

}
