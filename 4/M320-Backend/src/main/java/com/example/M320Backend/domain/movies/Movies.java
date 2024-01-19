package com.example.M320Backend.domain.movies;

import com.example.M320Backend.domain.movies.category.Category;
import com.example.M320Backend.domain.movies.reviews.Reviews;
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
@AllArgsConstructor //not sure about this
@Table(name = "movie_overview_movie")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "movie_id", nullable = false)
    private Integer id;

    @NotBlank
    @Size(min = 1, max = 255)
    @Column(name = "movie_name", nullable = false)
    private String movieTitle;

    @NotBlank(message = "Thumbnail needed")
    private String thumbnail;

    private String image;

    @Column(name = "release_date")
    private LocalDate date;

    @NotBlank
    @Size(min = 1, max = 500)
    @Column(name = "description")
    private String movieDesc;

    @Column(name = "length")
    private int movieLength;

    private String director;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "movie_overview_movie_reviews",
            joinColumns = {
                    @JoinColumn(name = "movie_id", referencedColumnName = "movie_id"),
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "reviews_id", referencedColumnName = "reviews_id")
            }
    )
    @Column(name = "rating")
    private Set<Reviews> movieReviews;

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
    @NotBlank
    @Column(name = "genre")
    private Set<Category> movieCategory;
}
