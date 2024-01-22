package com.example.M320Backend.config.persmissionEvaluator;

import com.example.M320Backend.domain.reviews.Reviews;
import com.example.M320Backend.domain.reviews.ReviewsRepository;
import com.example.M320Backend.domain.administration.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ReviewsPermissionEvaluator {
    private final ReviewsRepository repository;

    @Autowired
    public ReviewsPermissionEvaluator(ReviewsRepository repository) {
        this.repository = repository;
    }

    /*
    * The use of isReviewFromUser is to check if the review is from the user
    * who created the review.
    *
    * if not, then they cant remove it.
    */

    public boolean isReviewFromUser(Long reviewId, User user) {
        Optional<Reviews> entry = repository.findById(reviewId);

        return entry.map(reviews -> user.equals(reviews.getUserReviews())).orElse(false);
    }
}
