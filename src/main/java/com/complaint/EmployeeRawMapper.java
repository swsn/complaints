package com.complaint;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by amjadalmutairi on 8/16/16.
 */
public class EmployeeRawMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        Employee employee = new Employee();

        employee.setEmployeeId(rs.getString("employeeId"));
        employee.setemployeeName(rs.getString("employeeName"));
        employee.setPosition(rs.getString("position"));
        employee.setEmail(rs.getString("employeeEmail"));

        return employee;
    }
}
