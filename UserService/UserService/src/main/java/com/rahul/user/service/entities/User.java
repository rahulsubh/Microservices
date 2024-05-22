package com.rahul.user.service.entities;

import ch.qos.logback.core.model.NamedModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "micro_users")
public class User {
    @Id
    @Column(name = "id")
    private String userId;

    @Column(name = "NAME",length = 20)
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ABOUT")
    private String about;


    // it will not take this variable in the database.
    @Transient
    private List<Rating> ratings = new ArrayList<>();
}
