package com.example.M320Backend.domain.reviews;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
@RequestMapping("/reviews")
public class ReviewsController {

    private ReviewsService reviewsService;

    @Autowired
    public ReviewsController(ReviewsService reviewsService) {
        this.reviewsService = reviewsService;
    }

    /**
     * This endpoint handles the GET-request to retrieve all reviews for a specific movie.
     * It expects the movie ID as a path variable and returns a list of reviews associated with that movie.
     */
    @GetMapping({"/movie/reviews/{id}"})
    public ResponseEntity<List<Reviews>> getReviewsByMovie(@PathVariable("id") Long movieId) {
        List<Reviews> reviews = reviewsService.findReviewsByMovieId(movieId);
        return ResponseEntity.ok().body(reviews);
    }

    /**
     * This endpoint handles the GET-request to retrieve a single review by its ID.
     * It expects the review ID as a path variable and returns the corresponding review.
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<Reviews> singleReview(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(reviewsService.findById(id));
    }

    /**
     * This endpoint handles the POST-request to create a new review.
     * It requires a valid request body containing the review details and returns the created review.
     * Users with the 'POST' authority or admin role can access this endpoint.
     */
    @PostMapping
    @PreAuthorize("hasAuthority('POST') && @reviewsPermissionEvaluator.isReviewFromUser(#id, authentication.principal.user)|| hasRole('ADMIN')")
    public ResponseEntity<Reviews> postReview(@Valid @RequestBody() Reviews reviews) {
        return ResponseEntity.status(HttpStatus.CREATED).body(reviewsService.save(reviews));
    }

    /**
     * This endpoint handles the PUT-request to update an existing review by its ID.
     * It requires a valid request body containing the updated review details and returns the updated review.
     * Users with the 'PUT' authority or admin role can access this endpoint.
     */
    @PutMapping(value = "/{id}")
    @PreAuthorize("hasAuthority('PUT') && @reviewsPermissionEvaluator.isReviewFromUser(#id, authentication.principal.user)|| hasRole('ADMIN')")
    public ResponseEntity<Reviews> putReview(@Valid @PathVariable("id") Long id, @RequestBody Reviews reviews) {
        return ResponseEntity.status(200).body(reviewsService.updateById(id, reviews));
    }

    /**
     * This endpoint handles the DELETE-request to delete a review by its ID.
     * It requires a valid review ID as a path variable, and only users who authored the review
     * or have admin role can access this endpoint.
     */
    @DeleteMapping(value = "/{id}")
    @PreAuthorize("hasAuthority('DELETE') && @reviewsPermissionEvaluator.isReviewFromUser(#id, authentication.principal.user) || hasRole('ADMIN')")
    public void delReview(@Valid @PathVariable("id") Long id) {
        reviewsService.deleteById(id);
    }
}

