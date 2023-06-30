package com.persistent.jobportal.entity;
//create class ApplyJobs
//    job_id int,
//    user_id int,
//    status varchar(20),
//    created_at timestamp,
//    updated_at timestamp,
//    primary key(job_id,user_id),
//    foreign key(job_id) references jobs(job_id),
//    foreign key(user_id) references users(user_id)
//);

//create table job_applications
//    user_id int,
//    job_id int,
//    status varchar(20),
//    created_at timestamp,
//    updated_at timestamp,
//    primary key(user_id,job_id),
//    foreign key(user_id) references users(user_id),
//    foreign key(job_id) references jobs(job_id)
//);

//create table job_applications
//    user_id int,
//    job_id int,
//    status varchar(20),
//    created_at timestamp,
//    updated_at timestamp,
//    primary key(user_id,job_id),
//    job_id int,

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="apply_jobs")
public class ApplyJobs {
    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
    //create jobId
    private int jobId;
    //create email
    private String email;
}
