package com.example.M320Backend.domain.movieQuiz;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie_overview_movie_quiz")
public class MovieQuiz {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "movie_id", nullable = false)
    private Integer id;


}
