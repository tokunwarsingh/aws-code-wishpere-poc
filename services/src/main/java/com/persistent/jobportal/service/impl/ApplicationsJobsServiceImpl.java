package com.persistent.jobportal.service.impl;

import com.persistent.jobportal.entity.Applications;
import com.persistent.jobportal.repository.IApplicationsJobsRepository;
import com.persistent.jobportal.service.IApplicationsJobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationsJobsServiceImpl implements IApplicationsJobsService {

    // Autowired for interface IApplicationsJobsRepository
    @Autowired
    private IApplicationsJobsRepository applicationsJobsRepository;


    @Override
    public Applications addApplications(Applications applications) {
        return applicationsJobsRepository.save(applications);
    }

    @Override
    public void deleteApplications(Long applicationId, String userId) {
        applicationsJobsRepository.deleteByApplicationIdAndUserId(applicationId,userId);
    }

    @Override
    public Applications updateApplications(Applications applications, Long applicationId, String userId) {
        Applications applications1 = null;
        if(null!= applicationId && null!= userId) {
            applications1 = applicationsJobsRepository.findByApplicationIdAndUserId(applicationId, userId);
        }

        if(null!= applications1) {
            return applicationsJobsRepository.save(applications);
        } else {
            return applications1;
        }
    }

    @Override
    public Applications viewApplications(Long applicationId, String userId) {
        return applicationsJobsRepository.findByApplicationIdAndUserId(applicationId, userId);
    }

    @Override
    public List<Applications> viewAllApplications() {
        return applicationsJobsRepository.findAll();
    }
}
