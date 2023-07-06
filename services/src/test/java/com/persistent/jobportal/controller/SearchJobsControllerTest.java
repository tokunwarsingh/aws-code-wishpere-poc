/*package com.persistent.jobportal.controller;

import com.persistent.jobportal.entity.Applications;
import com.persistent.jobportal.entity.Jobs;
import com.persistent.jobportal.service.impl.ApplicationsJobsServiceImpl;
import com.persistent.jobportal.service.impl.SearchJobsServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class SearchJobsControllerTest {

    // mock dependency
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SearchJobsServiceImpl searchJobsServiceImpl;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void searchJobs() throws Exception {
        //mock data for searchJobs()
        List<Jobs> listJobs =  new ArrayList<Jobs>();
        Jobs applications1 = new Jobs();
        applications1.setJobId(1L);
        applications1.setJobTitle("Java");
        applications1.setLocation("Bengaluru");

        listJobs.add(applications1);

        given(searchJobsServiceImpl.searchJobs()).willReturn(listJobs);
        // mock data for ApplicationsJobsController class
        mockMvc.perform(get("/api/v1/jobs/all")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)));
    }

    @Test
    void searchJobs_success() {


    }


    @Test
    void searchJobsByJobId() {
    }

    @Test
    void searchJobsByLocation() {
    }

    @Test
    void searchJobsBySkill() {
    }

    @Test
    void searchJobsByTitle() {
    }

    @Test
    void searchJobsByCompany() {
    }

    @Test
    void searchJobsByDescription() {
    }

    @Test
    void createJob() {
    }
}*/