package com.example.M320Backend.domain.movieQuiz;

import com.example.M320Backend.config.generic.ExtendedEntity;
import com.example.M320Backend.domain.category.Category;
import com.example.M320Backend.domain.movies.Movies;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie_overview_movie_quiz")
public class MovieQuiz extends ExtendedEntity {

    private String question;

    private String answerA;

    private String answerB;

    private String answerC;

    private String answerD;

    private String answerE;

    @Transient
    @Column(name = "chosen_answer")
    private String chosenAnswer;

    @Transient
    private Movies recommendedMovie;

    public MovieQuiz(Long id, String question, String answerA, String answerB, String answerC, String answerD, String answerE) {
        super(id);
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.answerE = answerE;
    }
}
