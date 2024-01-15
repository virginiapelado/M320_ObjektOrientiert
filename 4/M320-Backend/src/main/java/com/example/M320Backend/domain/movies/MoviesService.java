package com.example.M320Backend.domain.movies;

import com.example.M320Backend.domain.movies.category.Category;
import com.example.M320Backend.domain.movies.exceptions.MovieOverviewExceptions;
import com.example.M320Backend.domain.movies.reviews.Reviews;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@Log4j2
public class MoviesService {

    @Autowired
    private MoviesRepository repository;

    public List<Movies> getMoviesWithFilter(String title, Set<Category> genre, Integer length, Set<Reviews> rating) {
        log.info("Movies filtered by name, genre, length, and rating");

        Movies movieFilter = new Movies();
        movieFilter.setMovieTitle(title);
        movieFilter.setMovieCategory(genre);
        movieFilter.setMovieLength(length);
        movieFilter.setMovieReviews(rating);

        /*
        * ExampleMatcher and Example:
        * They are used to dynamically build queries based on the provided filters
        *
        * currently they are being sorted in ascending order
         */
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);

        Example<Movies> example = Example.of(movieFilter, matcher);

        List<Movies> filteredMovies = repository.findAll(example, Sort.by(Sort.Direction.ASC, "name"));

        return filteredMovies;
    }

    public Movies getMovie(Integer id) throws MovieOverviewExceptions {
        log.info(id + " movie found");
        return repository.findById(id).orElseThrow(() -> new MovieOverviewExceptions("ID: "+ id + " of movie not found"));
    }

    public Movies createMovie(Movies movies) {
        log.info("movie created: " + movies);
        return repository.save(movies);
    }

    public Movies updateMovie(Movies movies, Integer id) throws MovieOverviewExceptions  {
        if(repository.existsById(id)) {
            movies.setId(id);
            return repository.save(movies);
        }
        return repository.findById(id).orElseThrow(() -> new MovieOverviewExceptions("ID: "+ id + " of movie not found"));
    }

    public void deleteMovie(Integer id) {
        log.info(id + " of movie deleted");
        repository.deleteById(id);
    }
}
