package com.github.ksimonovskii.jobscout.controller;

import com.github.ksimonovskii.jobscout.dto.JobDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jobs")
@RequiredArgsConstructor
public class JobController {

    @PostMapping("/read")
    public List<JobDto> readJobs() {

    }

}
