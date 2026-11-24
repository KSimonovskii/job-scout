package com.github.ksimonovskii.jobscout.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "company")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Company {
    @Id
    private String id;
    @Indexed(unique = true)
    private String name;
    private boolean inBlackList;

    public Company(String name) {
        this.name = name;
        this.inBlackList = false;
    }
}
