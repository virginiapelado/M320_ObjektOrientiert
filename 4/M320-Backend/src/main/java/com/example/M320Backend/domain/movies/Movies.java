package com.example.M320Backend.domain.movies;

import com.example.M320Backend.config.generic.ExtendedEntity;
import com.example.M320Backend.domain.category.Category;
import com.example.M320Backend.domain.reviews.Reviews;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;
import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie_overview_movie")
public class Movies extends ExtendedEntity {
    @NotBlank(message = "Name of Movie obligatory")
    @Size(min = 1, max = 255)
    @Column(name = "movie_name", nullable = false)
    private String movieTitle;

    @NotBlank
    @Size(min = 1, max = 750)
    @Column(name = "description")
    private String movieDesc;

    @Size(min = 1, max = 500)
    private String thumbnail;

    private String image;

    @Column(name = "length")
    private int movieLength;

    private String director;

    @Column(name = "release_date")
    private LocalDate date;

    @Column(name = "trending_now")
    private Boolean trendingNow;

    //one film can have many genres/ categories or reviews
    @Transient
    @OneToMany(fetch = FetchType.EAGER)
    @Column(name = "rating")
    private Set<Reviews> movieReviews;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "movie_overview_movie_category",
            joinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id")
    )
    private Set<Category> movieCategory;


    public Movies(Long id, String movieTitle, String movieDesc, String thumbnail, String image, int movieLength, String director, LocalDate date, Boolean trendingNow, Set<Reviews> movieReviews, Set<Category> movieCategory) {
        super(id);
        this.movieTitle = movieTitle;
        this.movieDesc = movieDesc;
        this.thumbnail = thumbnail;
        this.image = image;
        this.movieLength = movieLength;
        this.director = director;
        this.date = date;
        this.trendingNow = trendingNow;
        this.movieReviews = movieReviews;
        this.movieCategory = movieCategory;
    }
}
