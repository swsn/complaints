package com.complaint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by amjadalmutairi on 8/16/16.
 */

@RestController
@RequestMapping(value = "/complaints")
public  class ComplaintController {

    @Autowired
    private ComplaintRepository complaintRepository;

    private static int counter = 7; /** 7 --> because we already insert 6 complaints for the demo **/


    @RequestMapping(value = "/getAllOrderById", method = RequestMethod.GET )
    public List<Complaint> getAllOrderById(){
        return complaintRepository.getAllOrderById();
    }


    @RequestMapping(value = "/findByComplaintId/{id}", method = RequestMethod.GET )
    public Complaint findByComplaintId(@PathVariable int id){
        return complaintRepository.findByComplaintId(id);
    }

    @RequestMapping(value = "/findByEmployeeID/{id}", method = RequestMethod.GET )
    public List<Complaint> findByEmployeeID(@PathVariable String id) {
        return complaintRepository.findByEmployeeID(id);
    }

    @RequestMapping(value = "/findByRegion/{regionalDirector}", method = RequestMethod.GET )
    public List<Complaint> findByRegion (@PathVariable String regionalDirector){
        return complaintRepository.findByRegion(regionalDirector);
    }

    @RequestMapping(value = "/findByBranchNotByBM/{branchManager}", method = RequestMethod.GET )
    public List<Complaint> findByBranchNotByBM (@PathVariable String branchManager){
        return complaintRepository.findByBranchNotByBM(branchManager);
    }



    @RequestMapping(value = "/insert", method = RequestMethod.GET )
     public void insert(
                                    @RequestParam(value="title") String title,
                                    @RequestParam(value="content") String content,
                                    @RequestParam(value="date") String date,
                                    @RequestParam(value="type") String type,
                                    @RequestParam(value="byVisitor") boolean byVisitor,
                                    @RequestParam(value="employeeID") String employeeID,
                                    @RequestParam(value="visitorPhoneNumber") String visitorPhoneNumber,
                                    @RequestParam(value="projectId") int projectId
    )
    {

        int complaintId = counter++;
        complaintRepository.insert(new Complaint(complaintId,title,content,date,type,true,byVisitor,employeeID,visitorPhoneNumber,projectId));
    }

    @RequestMapping(value = "/closeComplaint/{id}", method = RequestMethod.GET )
    public Complaint closeComplaint( @PathVariable int id)
    {
        return complaintRepository.closeComplaint(id);
    }


}
