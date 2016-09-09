package com.complaint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by amjadalmutairi on 8/24/16.
 */


@RestController
@RequestMapping(value = "/worksOn")
public class worksOnController {



    @Autowired
    private WorksOnRepository worksOnRepository;


    @RequestMapping(value = "/findProjectOfEmployeeId/{id}", method = RequestMethod.GET )
    public int findProjectOfEmployeeId(@PathVariable String id) {
        return worksOnRepository.findProjectOfEmployeeId(id);

    }

    @RequestMapping(value = "/findEmployeeOfProject/{id}", method = RequestMethod.GET )
    public List<WorksOn> findEmployeeOfProject(@PathVariable int id) {
        return worksOnRepository.findEmployeeOfProject(id);
    }


    @RequestMapping(value = "/insert", method = RequestMethod.GET )
    public void insert(@RequestParam(value="employeeId") String employeeId ,
                       @RequestParam(value="projectId") int projectId
                       )
    {
         worksOnRepository.insert(new WorksOn(employeeId,projectId));


    }
}
