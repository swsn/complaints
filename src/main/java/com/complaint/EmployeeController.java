package com.complaint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by amjadalmutairi on 8/16/16.
 */

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public Employee findById(@PathVariable String id) {
        return employeeRepository.findById(id);
    }


    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public void insert(@RequestParam(value = "employeeId") String employeeId,
                       @RequestParam(value = "employeeName") String employeeName,
                       @RequestParam(value = "position") String position,
                       @RequestParam(value = "employeeEmail") String employeeEmail

    ) {
         employeeRepository.insert(new Employee(employeeId, employeeName, position, employeeEmail));

    }

}
