package com.example.M320Backend.domain.movies.reviews;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie_overview_reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "reviews_id")
    private Integer id;

    @Size(min = 1, max = 5, message = "Rating must be between 1 and 5")
    @Column(name = "rating")
    private double rating;

    @Column(name = "title")
    @Size(min = 1, max = 125)
    private String reviewTitle;

    @Size(min = 1, max = 550)
    private String description;
}
