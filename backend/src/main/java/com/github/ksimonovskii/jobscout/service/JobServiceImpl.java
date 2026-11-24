package com.github.ksimonovskii.jobscout.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.ksimonovskii.jobscout.dto.JobDto;
import com.github.ksimonovskii.jobscout.mapper.JobMapper;
import com.github.ksimonovskii.jobscout.model.Company;
import com.github.ksimonovskii.jobscout.model.Job;
import com.github.ksimonovskii.jobscout.repository.CompanyRepository;
import com.github.ksimonovskii.jobscout.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService{

    private final JobRepository jobRepository;
    private final CompanyRepository companyRepository;
    private final JobMapper mapper;
    private final DataFetcher dataFetcher;

    @Override
    public List<Job> importJobsFromScrapper() {
        List<Job> jobs =  dataFetcher.getData().stream()
                .filter(jobDto -> !jobRepository.existsById(jobDto.id()))
                .map((jobDto) -> {
            Company company = getCompanyByName(jobDto.companyName());
            return jobRepository.findJobById(jobDto.id()).orElseGet(() -> mapper.newEntity(jobDto, company));
        }).toList();

        return save(jobs);
    }

    private Company getCompanyByName(String name) {
        String companyName = (name == null || name.isBlank()? "Unknown company" : name.trim());
        return companyRepository.findFirstByNameIgnoreCase(companyName).orElseGet(() -> companyRepository.save(new Company(companyName)));
    }

    @Override
    public void save(Job job){
        jobRepository.save(job);
    }

    @Override
    public List<Job> save(List<Job> jobs){
        return jobRepository.saveAll(jobs);
    }
}
