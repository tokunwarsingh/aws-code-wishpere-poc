package com.persistent.jobportal.controller;

import com.persistent.jobportal.entity.Jobs;
import com.persistent.jobportal.service.impl.SearchJobsServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1/Jobs")
public class SearchJobsController {

    @Autowired
    private SearchJobsServiceImpl searchJobsServiceImpl;

    // create method for searching all jobs
    @GetMapping("/all")
    public ResponseEntity<List<Jobs>> searchJobs() {
        //List<Jobs> searchJobs = searchJobsServiceImpl.searchJobs();

        List<Jobs> searchJobs =  new ArrayList<Jobs>();
        Jobs job = new Jobs();
        job.setJobId(1L);
        job.setJobTitle("Test JOb1");
        job.setJobDescription("This is test Jobs1");
        job.setJobSkills(".Net");
        job.setCompany("Persistent");
        job.setLocation("bangalore");

        Jobs job2 = new Jobs();
        job2.setJobId(2L);
        job2.setJobTitle("Test JOb");
        job2.setJobDescription("This is test Jobs2");
        job2.setJobSkills("Azure");
        job2.setCompany("Persistent");
        job2.setLocation("bangalore");
        searchJobs.add(job2);

          return new ResponseEntity<List<Jobs>>(searchJobs, HttpStatus.OK);
    }


    //create method for searching by jobID
    @GetMapping("/jobID/{jobID}")
    public ResponseEntity<Jobs> searchJobsByJobId(@PathVariable("jobID") Long jobID) {
        Jobs searchJobs = searchJobsServiceImpl.searchJobsByJobId(jobID);
        return new ResponseEntity<Jobs>(searchJobs, HttpStatus.OK);
    }

    // create method for searching jobs by location
    @GetMapping("/location/{location}")
    public ResponseEntity<List<Jobs>> searchJobsByLocation(@PathVariable("location")
                                                               String location) {
        List<Jobs> searchJobs = searchJobsServiceImpl.searchJobsByJobLocation(location);
        return new ResponseEntity<List<Jobs>>(searchJobs, HttpStatus.OK);
    }

    //create method for searching jobs by skill
    @GetMapping("/jobSkills/{jobSkills}")
    public ResponseEntity<List<Jobs>> searchJobsBySkill(@PathVariable("jobSkills")
                                                            String jobSkills) {
        List<Jobs> searchJobs = searchJobsServiceImpl.searchJobsByJobSkills(jobSkills);
        return new ResponseEntity<List<Jobs>>(searchJobs, HttpStatus.OK);
    }

    //create method for searching jobs by job title
    @GetMapping("/jobTitle/{jobTitle}")
    public ResponseEntity<List<Jobs>> searchJobsByTitle(@PathVariable("jobTitle") String jobTitle) {
        List<Jobs> searchJobs = searchJobsServiceImpl.searchJobsByJobTitle(jobTitle);
        return new ResponseEntity<List<Jobs>>(searchJobs, HttpStatus.OK);
    }

    //create method for searching jobs by company
    @GetMapping("/company/{company}")
    public ResponseEntity<List<Jobs>> searchJobsByCompany(@PathVariable("company") String company) {
        List<Jobs> searchJobs = searchJobsServiceImpl.searchJobsByJobCompany(company);
        return new ResponseEntity<List<Jobs>>(searchJobs, HttpStatus.OK);
    }

    //create method for searching jobs by jobDescription
    @GetMapping("/description/{description}")
    public ResponseEntity<List<Jobs>> searchJobsByDescription(@PathVariable("jobDescription") String jobDescription) {
        List<Jobs> searchJobs = searchJobsServiceImpl.searchJobsByJobDescription(jobDescription);
        return new ResponseEntity<List<Jobs>>(searchJobs, HttpStatus.OK);
    }

    // create searchjob
    @PostMapping("/CreateJob")
    public ResponseEntity<Jobs> createJob(@RequestBody Jobs jobs) {
        Jobs searchJobs = searchJobsServiceImpl.searchJob(jobs);
        return new ResponseEntity<Jobs>(searchJobs, HttpStatus.OK);
    }

    @GetMapping("/search1")
    public ResponseEntity<Jobs> searchJob() {
        //Jobs searchJobs = searchJobsServiceImpl.searchJob(jobs);
        return new ResponseEntity<Jobs>( new Jobs(), HttpStatus.OK);
    }
}

