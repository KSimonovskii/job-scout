package com.github.ksimonovskii.jobscout.repository;

import com.github.ksimonovskii.jobscout.model.Job;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends MongoRepository<Job, Long> {
    public Job findJobById(String id);
}
