package com.example.M320Backend.domain.movies;

import com.example.M320Backend.domain.movies.category.Category;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.*;

@Entity
@Data
@Table(name = "movie_overview_movie")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "movie_id", nullable = false)
    private Long id;

    @Column(name = "movie_name", nullable = false)
    private String movieTitle;

    private String thumbnail;

    private String image;

    @Column(name = "release_date")
    private LocalDate date;

    @Column(name = "description")
    private String movieDesc;

    @Column(name = "length")
    private int movieLength;

    private String director;

    @Column(name = "rating")
    private double movieRating;

    @Column(name = "movie_length")
    private static ArrayList<String> movieReview = new ArrayList<>();

    //one film can have many genres/ categories
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "movie_overview_movie_category",
            joinColumns = {
                    @JoinColumn(name = "movie_id", referencedColumnName = "movie_id"),
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
            }
    )
    @Column(name = "genre")
    private Set<Category> movieCategory;

}
