package com.complaint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by amjadalmutairi on 8/16/16.
 */

@RestController
@RequestMapping(value = "/comments")
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;



    @RequestMapping(value = "/findByComplaintID/{id}" , method = RequestMethod.GET)
    public List<Comment> findByComplaintID(@PathVariable int id) {
        return commentRepository.findByCompliantID(id);
    }


    @RequestMapping(value = "/findByEmployeeIDAndComplaintID/{employeeId}/{complaintId}" , method = RequestMethod.GET)
    public Comment findByEmployeeIDAndComplaintID( @PathVariable String employeeId , @PathVariable int complaintId)

    { return commentRepository.findByEmployeeIDAndComplaintID(employeeId , complaintId) ; }



    @RequestMapping(value = "/insert" , method = RequestMethod.GET)
    public List<Comment> insert( @RequestParam(value="complaintId") int complaintId,
                                 @RequestParam(value="employeeId") String employeeId ,
                                 @RequestParam(value="date") String date,
                                 @RequestParam(value="content") String content
    )
    {
         commentRepository.insert(new Comment(complaintId,employeeId,date,content));
        return commentRepository.findByCompliantID(complaintId);

    }
}
