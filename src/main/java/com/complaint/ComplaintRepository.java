package com.complaint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by amjadalmutairi on 8/16/16.
 */

@Repository
@RequestMapping("/complaints")
public class ComplaintRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

     /* ------------------ SQL Statements ------------------ */

    private static final String SQL_FIND_ALL = "select * from Complaint ORDER BY complaintId";
    private static final String SQL_FIND_BY_ComplaintID ="select * from Complaint where complaintId=?";
    private static final String SQL_FIND_BY_EmployeeID ="select * from Complaint where employeeId=?";
    private static final String SQL_Find_By_Region  = "SELECT * FROM Complaint where projectId IN ( Select projectId from project where regionalDirector =? )" ;
    private static final String SQL_Find_By_Branch_NOT_BY_BM  = "SELECT * FROM Complaint where projectId IN ( Select projectId from project where branchManager=? )AND( (employeeId !=?)OR( byvisitor=true)) " ;
    private static final String SQL_INSERT_INTO = "insert into Complaint(complaintId,title,content,date,type,isOpen,byVisitor,employeeId,visitorPhoneNumber,projectId) values(?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_Close_Complaint ="update Complaint set isOpen=0 where complaintId=?";

    /* ------------------ Retrive Statements ------------------ */

    @Transactional(readOnly=true)
    public List<Complaint> getAllOrderById() {return jdbcTemplate.query(SQL_FIND_ALL, new ComplaintRawMapper());
    }


    @Transactional(readOnly=true)
    public Complaint findByComplaintId(int id) {
        return jdbcTemplate.queryForObject(SQL_FIND_BY_ComplaintID, new ComplaintRawMapper(), id);
    }


    @Transactional(readOnly=true)
    public  List<Complaint>  findByEmployeeID(String id) {
        return jdbcTemplate.query(SQL_FIND_BY_EmployeeID, new ComplaintRawMapper(), id);
    }



    @Transactional(readOnly=true)
    public  List<Complaint>  findByRegion(String regionalDirector) {
        return jdbcTemplate.query(SQL_Find_By_Region , new ComplaintRawMapper(), regionalDirector);

    }

    @Transactional(readOnly=true)
    public  List<Complaint> findByBranchNotByBM (String branchManager ) {
        return jdbcTemplate.query(SQL_Find_By_Branch_NOT_BY_BM , new ComplaintRawMapper(), branchManager, branchManager );

    }

    /* ------------------- Insert New Complaint  ------------------*/

    public void insert(final Complaint complaint)
    {

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(SQL_INSERT_INTO, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, complaint.getComplaintId());
                ps.setString(2, complaint.getTitle());
                ps.setString(3, complaint.getContent());
                ps.setString(4, complaint.getDate());
                ps.setString(5, complaint.getType());
                ps.setBoolean(6, complaint.isOpen());
                ps.setBoolean(7, complaint.isByVisitor());
                ps.setString(8, complaint.getEmployeeID());
                ps.setString(9, complaint.getVisitorPhoneNumber());
                ps.setInt(10, complaint.getProjectId());

                return ps;
            }
        });


    }

     /* ------------------ Close complaint ------------------ */

    public Complaint closeComplaint(int complaintId) {

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(SQL_Close_Complaint, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1,complaintId);
                return ps;
            }
        });

        return this.findByComplaintId(complaintId);

    }


}
