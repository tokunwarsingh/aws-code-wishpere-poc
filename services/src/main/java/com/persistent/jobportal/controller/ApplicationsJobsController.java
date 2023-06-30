package com.persistent.jobportal.controller;

import com.persistent.jobportal.entity.Applications;
import com.persistent.jobportal.service.impl.ApplicationsJobsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//create a class for ApplicationsJobsController
@RestController
@RequestMapping("/api/v1/applications")
public class ApplicationsJobsController {

    @Autowired
    private ApplicationsJobsServiceImpl applicationsJobsServiceImpl;

    //create a method for getting all the applications
    @GetMapping("/all")
    public ResponseEntity<List<Applications>> getAllApplications() {
        List<Applications> allApplications = applicationsJobsServiceImpl.viewAllApplications();
        return new ResponseEntity<List<Applications>>(allApplications, HttpStatus.OK);
    }

    //create a method for getting applications by applicationId and userId
    @GetMapping("/application/{applicationId}/{userId}")
    public ResponseEntity<Applications> getApplicationsByApplicationId_and_User_Id(@PathVariable("applicationId") Long applicationId, @PathVariable("userId") String userId) {
        Applications applications = applicationsJobsServiceImpl.viewApplications(applicationId, userId);
        return new ResponseEntity<Applications>(applications, HttpStatus.OK);
    }

    //create  a method for updating applications by applicationsId, userId
    @PutMapping("/update/{applicationId}/{userId}")
    public ResponseEntity<Applications> updateApplicationsByApplicationId_and_User_Id(@PathVariable("applicationId") Long applicationId, @PathVariable("userId") String userId, @RequestBody Applications applications) {
        Applications updatedApplications = applicationsJobsServiceImpl.updateApplications(applications, applicationId, userId);
        return new ResponseEntity<Applications>(updatedApplications, HttpStatus.OK);
    }

    //create a method for saving applications
    @PostMapping("/save")
    public ResponseEntity<Applications> saveApplications(@RequestBody Applications applications) {
        Applications savedApplications = applicationsJobsServiceImpl.addApplications(applications);
        return new ResponseEntity<Applications>(savedApplications, HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{applicationId}/{userId}")
    public ResponseEntity<String> deleteApplicationsByApplicationId_and_User_Id(@PathVariable("applicationId") Long applicationId, @PathVariable("userId") String userId) {
        applicationsJobsServiceImpl.deleteApplications(applicationId, userId);
        return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
    }


}
