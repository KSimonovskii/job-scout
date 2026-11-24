package com.github.ksimonovskii.jobscout.mapper;

import com.github.ksimonovskii.jobscout.dto.JobDto;
import com.github.ksimonovskii.jobscout.model.Company;
import com.github.ksimonovskii.jobscout.model.Job;
import com.github.ksimonovskii.jobscout.model.JobStatus;
import org.springframework.stereotype.Component;

@Component
public class JobMapper {

    public Job newEntity(JobDto source, Company company) {

        return Job.builder()
                .id(source.id())
                .title(source.title())
                .company(company)
                .location(source.location())
                .salaryInfo(source.salaryInfo())
                .contractType(source.contractType())
                .experienceLevel(source.experienceLevel())
                .workType(source.workType())
                .publishedAt(source.publishedAt())
                .applicationsCount(source.applicationsCount())
                .description(source.description())
                .applyUrl(source.applyUrl())
                .jobUrl(source.jobUrl())
                .status(JobStatus.NEW)
                .build();
    }
}
