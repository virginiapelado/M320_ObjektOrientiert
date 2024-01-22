package com.example.M320Backend.domain.movies;

import com.example.M320Backend.config.generic.ExtendedJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends ExtendedJpaRepository<Movies> {
}