package com.github.ksimonovskii.jobscout.repository;

import com.github.ksimonovskii.jobscout.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends MongoRepository<Company, String> {
    public Optional<Company> findFirstByNameIgnoreCase(String name);
}
