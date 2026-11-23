package com.github.ksimonovskii.jobscout.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.ksimonovskii.jobscout.dto.JobDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class DataFetcherMockImpl implements DataFetcher {

    private final ObjectMapper mapper;
    private final Resource file;

    public DataFetcherMockImpl(
            ObjectMapper mapper,
            @Value("classpath:mocks/mock-jobs.json")
            Resource file) {
        this.mapper = mapper;
        this.file = file;
    }

    @Override
    public List<JobDto> getData() {

        try (InputStream inputStream = file.getInputStream()) {
            return mapper.readValue(inputStream, new TypeReference<List<JobDto>>() {
            });
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения данных из json-файла", e);
        }
    }
}
