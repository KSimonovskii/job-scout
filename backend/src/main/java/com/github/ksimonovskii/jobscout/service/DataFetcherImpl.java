package com.github.ksimonovskii.jobscout.service;

import com.github.ksimonovskii.jobscout.dto.JobDto;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@ConditionalOnProperty(name = "parser.provider", havingValue = "work")
public class DataFetcherImpl implements DataFetcher{
    @Override
    public List<JobDto> getData() {
        return List.of();
    }
}
