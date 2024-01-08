package com.example.M320Backend.domain.authority;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "movie_overview_authorities")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="auth_id")
    private Integer authId;
    @Column(name="name")
    private String authName;
}