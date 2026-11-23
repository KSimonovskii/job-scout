package com.github.ksimonovskii.jobscout.service;

import com.github.ksimonovskii.jobscout.dto.JobDto;

import java.util.List;

public interface DataFetcher {
    public List<JobDto> getData();
}
