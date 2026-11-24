package com.github.ksimonovskii.jobscout.service;

import com.github.ksimonovskii.jobscout.dto.JobDto;
import com.github.ksimonovskii.jobscout.model.Job;
import org.springframework.stereotype.Service;

import java.util.List;

public interface JobService {
    public List<Job> importJobsFromScrapper();
    void save(Job job);
    List<Job> save(List<Job> jobs);

}
