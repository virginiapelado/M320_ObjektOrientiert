package com.example.M320Backend.domain.reviews;

import com.example.M320Backend.config.generic.ExtendedEntity;
import com.example.M320Backend.domain.administration.user.User;
import com.example.M320Backend.domain.movies.Movies;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie_overview_reviews")
public class Reviews extends ExtendedEntity {

    @Size(min = 1, max = 5, message = "Rating must be between 1 and 5")
    @Column(name = "rating")
    private float rating;

    @Column(name = "title")
    @Size(min = 1, max = 255)
    private String reviewTitle;

    @Size(min = 1, max = 750)
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "movie_id")
    private Movies movie;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User userReviews;

    public Reviews(Long id, float rating, String reviewTitle, String description, Movies movie, User userReviews) {
        super(id);
        this.rating = rating;
        this.reviewTitle = reviewTitle;
        this.description = description;
        this.movie = movie;
        this.userReviews = userReviews;
    }
}
