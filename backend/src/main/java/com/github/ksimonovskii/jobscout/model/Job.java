package com.github.ksimonovskii.jobscout.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.Instant;
import java.util.List;

@Document(collection = "job")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Job {
    @Id
    private String id;
    private String title;
    @DocumentReference
    private Company company;
    private String location;
    private List<String> salaryInfo;
    private String contractType;
    private String experienceLevel;
    private String workType;
    private Instant publishedAt;
    private String applicationsCount;
    private String description;
    private String applyUrl;
    private String jobUrl;
    @Builder.Default
    private JobStatus status = JobStatus.NEW;
    private String notes;

    public String toString() {
        return "Job id: " +
                this.id +
                ", title:" +
                this.title +
                ", company: " +
                this.company;
    }
}
