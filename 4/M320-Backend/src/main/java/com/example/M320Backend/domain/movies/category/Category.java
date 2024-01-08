package com.example.M320Backend.domain.movies.category;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "movie_overview_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "category_id")
    private Long id;

    @Column(nullable = false)
    private String category;
}
