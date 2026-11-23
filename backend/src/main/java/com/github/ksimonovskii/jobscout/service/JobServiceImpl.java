package com.github.ksimonovskii.jobscout.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.ksimonovskii.jobscout.dto.JobDto;
import com.github.ksimonovskii.jobscout.model.Job;
import com.github.ksimonovskii.jobscout.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService{

    private final JobRepository jobRepository;
    private final ObjectMapper mapper;
    private final DataFetcher dataFetcher;

    @Override
    public List<JobDto> readJobsFromScrapper() {
        return dataFetcher.getData();
    }

    @Override
    public void save(Job job){
        jobRepository.save(job);
    }

    @Override
    public void save(List<Job> jobs){
        jobRepository.saveAll(jobs);
    }
}
