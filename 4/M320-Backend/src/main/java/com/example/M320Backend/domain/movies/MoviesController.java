package com.example.M320Backend.domain.movies;


import com.example.M320Backend.domain.category.Category;
import com.example.M320Backend.domain.reviews.Reviews;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@Log4j2
@RequestMapping("/movies")
public class MoviesController {

    private MoviesService moviesService;

    @Autowired
    public MoviesController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    /**
     * This endpoint handles the GET-request by retrieving all movies
     * Though it also looks forward to title, genre, length and rating to see if they've been set
     * and filters the site through request
     */
    @GetMapping
    @Operation(summary = "Fetches all Movies", description = "When successful it fetches all movies and returns a JSON-Code with the status code 200.")
    public ResponseEntity<List<Movies>> allMovies(@RequestParam(value = "name", required = false) String title, Set<Category> genre, Integer length, Set<Reviews> rating) {
        return ResponseEntity.ok().body(moviesService.getMoviesWithFilter(title, genre, length, rating));
    }

    /**
     * This endpoint handles the GET-request retrieving movies by ID
     */
    @GetMapping(value = "/{id}")
    @Operation(summary = "Fetches the wished Movie", description = "When successful it fetches the wished movie and returns the JSON-Code with the status code 200.")
    public ResponseEntity<Movies> singleMovie (@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(moviesService.findById(id));
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
        return ResponseEntity.status(HttpStatus.CREATED).body(moviesService.save(movie));
    }

    /**
     * This endpoint handles the PUT-request for updating movie by ID:
     * If the movie exists, it allows the user to modify it
     * and returns the updated movie as response.
     */
    @PutMapping(value = "/{id}")
    @PreAuthorize("hasAuthority('PUT')")
    @Operation(summary = "Updates Movie", description = "When successful it updates the movie based on the given values and returns the JSON-Code of the updated movie with the status code 200.")
    public ResponseEntity<Movies> putMovie(@Valid @PathVariable("id")Long id, @RequestBody Movies movie) {
        return ResponseEntity.status(200).body(moviesService.updateById(id, movie));
    }

    /**
     * This endpoint handles the DELETE-request for deleting movie by ID:
     * If the movie exists, it allows the user to delete it
     * and returns nothing as response.
     */
    @DeleteMapping(value = "/{id}")
    @PreAuthorize("hasAuthority('DELETE')")
    @Operation(summary = "Deletes the Movie", description = "When successful it deletes the movie with the status code 200.")
    public void deleteMovie(@Valid @PathVariable("id") Long id) {
        moviesService.deleteById(id);
    }

}
