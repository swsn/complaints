package com.complaint;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by amjadalmutairi on 8/16/16.
 */
public class CommentRawMapper implements RowMapper<Comment> {
    @Override
    public Comment mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        Comment comment = new Comment();

        comment.setComplaintId(rs.getInt("complaintId"));
        comment.setEmployeeId(rs.getString("employeeId"));
        comment.setDate(rs.getString("date"));
        comment.setContent(rs.getString("content"));

        return comment;
    }
}
