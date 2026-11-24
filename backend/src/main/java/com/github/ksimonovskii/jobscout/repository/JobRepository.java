package com.github.ksimonovskii.jobscout.repository;

import com.github.ksimonovskii.jobscout.model.Job;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JobRepository extends MongoRepository<Job, String> {
    public Optional<Job> findJobById(String id);
}
