package com.complaint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by amjadalmutairi on 8/16/16.
 */
@RestController
@RequestMapping(value = "/visitors")
public class VisitorController {

    @Autowired
    private VisitorRepository visitorRepository;


    @RequestMapping(value = "/findById/{phoneNumber}", method = RequestMethod.GET )
    public Visitor findById(@PathVariable String phoneNumber){
        return visitorRepository.findById(phoneNumber);
    }


    @RequestMapping(value = "/insert", method = RequestMethod.GET )
    public void insert(@RequestParam(value="phoneNumber") String phoneNumber ,
                       @RequestParam(value="visitorName") String visitorName,
                       @RequestParam(value="visitorEmail") String visitorEmail )
    {
         visitorRepository.insert(new Visitor(phoneNumber,visitorName,visitorEmail));

    }

}
