package com.example.M320Backend.domain.movies;

import com.example.M320Backend.config.generic.ExtendedService;
import com.example.M320Backend.domain.category.Category;
import com.example.M320Backend.domain.reviews.Reviews;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

@Service
@Log4j2
public class MoviesService extends ExtendedService<Movies> {
    protected final String noIDFoundErrorMsg = "ID '%s' not found";
    private MoviesRepository repository;

    @Autowired
    protected MoviesService(MoviesRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<Movies> getMoviesWithFilter(String title, Set<Category> genre, Integer length, Set<Reviews> rating) {
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

        log.info("Movies filtered by name, genre, length, and rating");
        return filteredMovies;
    }

    @Override
    public Movies findById(Long id) {
        Optional<Movies> optional = repository.findById(id);

        if (optional.isPresent()) {
            log.info(id + " movie found");
            return optional.get();
        } else {
            throw new NoSuchElementException(String.format(noIDFoundErrorMsg, id));
        }
    }

    @Override
    public Movies save(Movies entity) {
        log.info("movie created: " + entity.getId());
        return repository.save(entity);
    }

    @Override
    public Movies updateById(Long id, Movies entity) {
        if (repository.existsById(id)) {
            entity.setId(id);
            log.info(id + " movie found");
            return repository.save(entity);
        } else {
            throw new NoSuchElementException(String.format(noIDFoundErrorMsg, id));
        }
    }

    @Override
    public void deleteById(Long id) {
        if (repository.existsById(id)) {
            log.info(id + " of movie deleted");
            repository.deleteById(id);
        } else {
            throw new NoSuchElementException(String.format(noIDFoundErrorMsg, id));
        }
    }
}