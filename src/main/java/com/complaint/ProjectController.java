package com.complaint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by amjadalmutairi on 8/16/16.
 */

@RestController
@RequestMapping("/projects")
public class ProjectController {


        @Autowired
        private ProjectRepository projectRepository;



        @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET )
        public Project findById(@PathVariable int id){return projectRepository.findById(id);
        }


        @RequestMapping(value = "/findByBranchManager/{branchManager}", method = RequestMethod.GET )
        public Project findByBranchManager(@PathVariable String branchManager) {
        return  projectRepository.findByBranchManager(branchManager);
        }

        @RequestMapping(value = "/findByRegionalDirector/{regionalDirector}", method = RequestMethod.GET )
        public List<Project> findByRegionalDirector (@PathVariable  String regionalDirector)
        {
                return projectRepository.findByRegionalDirector(regionalDirector);
        }


        @RequestMapping(value = "/findTheRegionalDirector/{region}", method = RequestMethod.GET )
        public String  findTheRegionalDirector(@PathVariable String region) {

              return projectRepository.findTheRegionalDirector(region);
        }


        @RequestMapping(value = "/insert", method = RequestMethod.GET )
        public void insert( @RequestParam(value="projectId") int projectId,
                                     @RequestParam(value="name") String name ,
                                     @RequestParam(value="city") String projectCity,
                                     @RequestParam(value="branch") String projectBranch ,
                                     @RequestParam(value="branchManager") String branchManager,
                                     @RequestParam(value="regionalDirector") String regionalDirector


        ) throws SQLException {
             projectRepository.insert(new Project(projectId,name,projectCity,projectBranch , branchManager,regionalDirector ));
        }


}
