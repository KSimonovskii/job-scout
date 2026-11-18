package com.github.ksimonovskii.jobscout.service;

import com.github.ksimonovskii.jobscout.dto.JobDto;

import java.util.List;

public interface JobService {
    public List<JobDto> readJobsFromScrapper();
}
