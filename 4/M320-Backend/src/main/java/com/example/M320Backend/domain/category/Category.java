package com.example.M320Backend.domain.category;

import com.example.M320Backend.config.generic.ExtendedEntity;
import com.example.M320Backend.domain.movies.Movies;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "movie_overview_category")
public class Category extends ExtendedEntity {

    @Column(nullable = false)
    @Size(min = 1, max = 255)
    private String category;

    @Transient
    private Set<Movies> movies;

    public Category(Long id, String category) {
        super(id);
        this.category = category;
    }
}
