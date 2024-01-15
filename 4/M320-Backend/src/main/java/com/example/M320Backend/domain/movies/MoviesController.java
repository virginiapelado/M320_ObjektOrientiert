package com.example.M320Backend.domain.movies;


import com.example.M320Backend.domain.movies.category.Category;
import com.example.M320Backend.domain.movies.exceptions.MovieOverviewExceptions;
import com.example.M320Backend.domain.movies.reviews.Reviews;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@RestController
@Log4j2
@RequestMapping("/movies")
@CrossOrigin(origins = "http://localhost:3000/")
public class MoviesController {

    @Autowired
    private MoviesService service;

    /**
     * This endpoint handles the GET-request by retrieving all movies
     * Though it also looks forward to title, genre, length and rating to see if they've been set
     * and filters the site through request
     */
    @GetMapping
    @Operation(summary = "Fetches all Movies", description = "When successful it fetches all movies and returns a JSON-Code with the status code 200.")
    public ResponseEntity<List<Movies>> allMovies(@RequestParam(value = "name", required = false) String title, Set<Category> genre, Integer length, Set<Reviews> rating) {
        return ResponseEntity.ok().body(service.getMoviesWithFilter(title, genre, length, rating));
    }

    /**
     * This endpoint handles the GET-request retrieving movies by ID
     */
    @GetMapping(value = "/{movie_id}")
    @Operation(summary = "Fetches the wished Movie", description = "When successful it fetches the wished movie and returns the JSON-Code with the status code 200.")
    public ResponseEntity<Movies> singleMovie (@PathVariable("movie_id") Integer id) throws MovieOverviewExceptions {
        return ResponseEntity.ok().body(service.getMovie(id));
    }

    /**
     * This endpoint handles the POST-request for creating movie
     * It creates the movie by the given values
     * and returns the movie as response.
     */
    @PostMapping
    @PreAuthorize("hasAuthority('POST')")
    @Operation(summary = "Creates Movie", description = "When successful it creates a movie based on the given values and returns the JSON-Code with the status code 201.")
    public ResponseEntity<Movies> postMovie (@Valid @RequestBody() Movies movie) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createMovie(movie));
    }

    /**
     * This endpoint handles the PUT-request for updating movie by ID:
     * If the movie exists, it allows the user to modify it
     * and returns the updated movie as response.
     */
    @PutMapping(value = "/{movie_id}")
    @PreAuthorize("hasAuthority('PUT')")
    @Operation(summary = "Updates Movie", description = "When successful it updates the movie based on the given values and returns the JSON-Code of the updated movie with the status code 200.")
    public ResponseEntity<Movies> putMovie(@Valid @PathVariable("movie_id")Integer id, @RequestBody Movies movie) throws MovieOverviewExceptions {
        return ResponseEntity.status(200).body(service.updateMovie(movie, id));
    }

    /**
     * This endpoint handles the DELETE-request for deleting movie by ID:
     * If the movie exists, it allows the user to delete it
     * and returns nothing as response.
     */
    @DeleteMapping(value = "/{movie_id}")
    @PreAuthorize("hasAuthority('DELETE')")
    @Operation(summary = "Deletes the Movie", description = "When successful it deletes the movie with the status code 200.")
    public void deleteDrink(@Valid @PathVariable("movie_id") Integer id) {
        service.deleteMovie(id);
    }

    /**
     * To reduce User Error Robustness we use these following Exception-Methods:
     * - If ID isn't found
     * - If the user doesn't comply the validation rules in update and create
     * - If the user passes an illegal argument to a method
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

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException iae) {
        log.warn("Illegal argument", iae);
        return ResponseEntity.badRequest().body(iae.getMessage());
    }
}
