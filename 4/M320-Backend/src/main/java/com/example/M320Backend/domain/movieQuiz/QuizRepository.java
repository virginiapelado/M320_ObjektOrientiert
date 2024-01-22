package com.example.M320Backend.domain.movieQuiz;

import com.example.M320Backend.config.generic.ExtendedJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends ExtendedJpaRepository<MovieQuiz> {
}
