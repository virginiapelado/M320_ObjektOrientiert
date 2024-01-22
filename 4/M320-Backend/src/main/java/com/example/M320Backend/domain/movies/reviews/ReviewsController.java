package com.example.M320Backend.domain.movies.reviews;

import com.example.M320Backend.domain.movies.exceptions.MovieOverviewExceptions;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@Log4j2
@RequestMapping("/movies/review")
@CrossOrigin(origins = "http://localhost:3000/")
public class ReviewsController {

    //TODO: Permission Evaluator and its Exception

    @Autowired
    private ReviewsService service;

    @GetMapping(value = "/{reviews_id}")
    public ResponseEntity<Reviews> singleReview(@PathVariable("reviews_id") Integer id) throws MovieOverviewExceptions {
        return ResponseEntity.ok().body(service.getReview(id));
    }

    @PostMapping
    @PreAuthorize("hasAuthority('POST')")
    public ResponseEntity<Reviews> postReview(@Valid @RequestBody() Reviews reviews) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createReview(reviews));
    }

    @PutMapping(value = "/{reviews_id}")
    @PreAuthorize("hasAuthority('PUT')")
    public ResponseEntity<Reviews> putMovie(@Valid @PathVariable("reviews_id")Integer id, @RequestBody Reviews reviews) throws MovieOverviewExceptions {
        return ResponseEntity.status(200).body(service.updateReviews(reviews, id));
    }

    @DeleteMapping(value = "/{movie_id}")
    @PreAuthorize("hasAuthority('DELETE')")
    public void deleteDrink(@Valid @PathVariable("movie_id") Integer id) {
        service.deleteReview(id);
    }

    /**
     * To reduce User Error Robustness we use these following Exception-Methods:
     * - If ID isn't found
     * - If the user doesn't comply the validation rules in update and create
     * - If the reviews is not the users
     */

    @ExceptionHandler(MovieOverviewExceptions.class)
    public ResponseEntity<String> handlerNoSuchReviewException(MovieOverviewExceptions moe) {
        log.error("ID not found");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(moe.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handlerNoNullReviewException(MethodArgumentNotValidException manve) {
        log.warn("Fill everything out");
        return ResponseEntity.status(400).body(Objects.requireNonNull(manve.getFieldError()).getDefaultMessage());
    }

    //permission evaluator exception
}

