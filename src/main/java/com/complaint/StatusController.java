package com.complaint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by amjadalmutairi on 8/16/16.
 */

@RestController
@RequestMapping(value = "/status")
public class StatusController {


    @Autowired
    private StatusRepository statusRepository;


    @RequestMapping(value = "/findByComplaintId/{id}", method = RequestMethod.GET )
    public List<Status> findByComplaintId(@PathVariable int id) {
        return statusRepository.findByComplaintId(id);
    }

    @RequestMapping(value = "/findByComplaintIdAndEmployeeId/{employeeId}/{compliantId}", method = RequestMethod.GET )
    public Status findByComplaintIdAndEmployeeId(@PathVariable String employeeId , @PathVariable int compliantId)
    {
        return statusRepository.findByComplaintIdAndEmployeeId(employeeId, compliantId);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET )
    public Status insert( @RequestParam(value="complaintId") int complaintId ,
                                @RequestParam(value="employeeId") String employeeId,
                                @RequestParam(value="date") String date ,
                                @RequestParam(value="value") Boolean value)
    {
        return statusRepository.insert(new Status(complaintId,employeeId,value,date));

    }




}
