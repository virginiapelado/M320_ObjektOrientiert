package com.example.M320Backend.domain.administration.authority;

import com.example.M320Backend.config.generic.ExtendedEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "movie_overview_authorities")
public class Authority extends ExtendedEntity {
    @Column(name="name")
    private String authName;

    public Authority(Long id, String authName) {
        super(id);
        this.authName = authName;
    }
}