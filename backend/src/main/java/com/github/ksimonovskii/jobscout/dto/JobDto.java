package com.github.ksimonovskii.jobscout.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record JobDto(
        String jobId,
        @JsonProperty("jobTitle")
        String title,
        String companyName,
        String location,
        List<String> salaryInfo,
        String contractType,
        String experienceLevel,
        String workType,
        Instant publishedAt,
        String applicationsCount,
        @JsonProperty("jobDescription")
        String description,
        String applyUrl,
        String jobUrl
){}
