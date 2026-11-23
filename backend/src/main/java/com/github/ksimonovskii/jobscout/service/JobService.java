package com.github.ksimonovskii.jobscout.service;

import com.github.ksimonovskii.jobscout.dto.JobDto;
import com.github.ksimonovskii.jobscout.model.Job;
import org.springframework.stereotype.Service;

import java.util.List;

public interface JobService {
    public List<JobDto> readJobsFromScrapper();
    void save(Job job);
    void save(List<Job> jobs);

}
